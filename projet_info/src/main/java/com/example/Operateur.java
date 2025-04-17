/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

import java.util.ArrayList;

/**
 *
 * @author arthu
 */

public class Operateur {
    private String code;
    private String nom;
    private String prenom;
    private ArrayList<Machine> competences;
    private String statut;

    // Getters and Setters
    public String getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public ArrayList<Machine> getCompetences() {
        return competences;
    }

    public String getStatut() {
        return statut;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setCompetences(ArrayList<Machine> competences) {
        this.competences = competences;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    // Constructeur
    public Operateur(String code, String nom, String prenom, ArrayList<Machine> competences, String statut) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.competences = competences;
        this.statut = statut;
    }
    
    
    
            
}
