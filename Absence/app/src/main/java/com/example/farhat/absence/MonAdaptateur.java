package com.example.farhat.absence;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Farhat on 12/12/2017.
 */

public class MonAdaptateur extends ArrayAdapter<Etudiant> {
    private Activity context;
    private ArrayList<Etudiant> list;

    public MonAdaptateur(Activity context,ArrayList<Etudiant> list) {

        super (context , R.layout.listetudiant , list) ;
        this.context = context ;
        this.list = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=context.getLayoutInflater();
        View v=layoutInflater.inflate(R.layout.listetudiant,null,true) ;

        TextView name = (TextView) v.findViewById(R.id.nom);
        TextView lastName = (TextView) v.findViewById(R.id.prenom);
        CheckBox checked = (CheckBox) v.findViewById(R.id.check) ;
        name.setText(list.get(position).getNom());
        lastName.setText(list.get(position).getPrenom());

        return v;
    }
}
