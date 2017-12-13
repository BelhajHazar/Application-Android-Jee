package com.example.farhat.absence;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.Toast;


import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class MainActivity extends AppCompatActivity {
    ListView listEtud;
    ArrayList<Etudiant> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listEtud = (ListView) findViewById(R.id.list);
        list = new ArrayList<>();

        getAllStudent() ;

        listEtud.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CheckBox checkBox = (CheckBox) view.findViewById(R.id.check);
                if(checkBox.isChecked()) {
                    checkBox.setChecked(true);
                    updateChecked(1 , list.get(position).getId());
                }else{
                    checkBox.setChecked(false);
                    updateChecked(0,list.get(position).getId()) ;
                }

            }
        });
    }
    private void updateChecked(final int etat , final String idE){
        Toast.makeText(this, ""+idE, Toast.LENGTH_SHORT).show();
        StringRequest request = new StringRequest(Request.Method.POST, Config.updatePresence,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {}
                }, new Response.ErrorListener(
        ) {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this, ""+error, Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String>params =  new HashMap<>();
                params.put("idE",idE);
                params.put("etat",etat+"");
                return params;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this) ;
        requestQueue.add(request);
    }

    private void getAllStudent(){
        StringRequest request = new StringRequest(Request.Method.POST, Config.getAllStudent,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        getDonnee(response) ;
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this, ""+error, Toast.LENGTH_SHORT).show();
            }
        }) ;
        RequestQueue requestQueue = Volley.newRequestQueue(this) ;
        requestQueue.add(request);
    }
    private void getDonnee(String JSON) {
        try{
            JSONArray jsonArray = new JSONArray(JSON) ;
            for(int i = 0 ; i<jsonArray.length();i++){
                JSONObject jsonObject = jsonArray.getJSONObject(i) ;
                Etudiant etudiant = new Etudiant(jsonObject.getString("id"),jsonObject.getString("name"),jsonObject.getString("lastname")) ;
                list.add(etudiant);
            }
            MonAdaptateur monAdaptateur = new MonAdaptateur(this , list) ;
            listEtud.setAdapter(monAdaptateur);
        }catch (Exception e){
            Toast.makeText(this, ""+e, Toast.LENGTH_SHORT).show();
        }
    }
}
