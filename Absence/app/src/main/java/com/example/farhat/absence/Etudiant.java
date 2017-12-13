package com.example.farhat.absence;

/**
 * Created by Farhat on 12/12/2017.
 */

public class Etudiant {
    String id;
    String nom;
    String prenom;

    public String getId() {
        return id;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

     public Etudiant(String id , String nom, String prenom){
        this.id = id;
         this.nom= nom;
         this.prenom=prenom;
     }
}
