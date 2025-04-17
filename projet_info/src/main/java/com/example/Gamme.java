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
public class Gamme {
    private String refGamme;
    private ArrayList<Operation> operations;
    private ArrayList<Equipement> equipements;

    // Getters & Setters
    public String getRefGamme() {
        return refGamme;
    }

    public ArrayList<Operation> getOperations() {
        return operations;
    }

    public ArrayList<Equipement> getEquipements() {
        return equipements;
    }

    public void setRefGamme(String refGamme) {
        this.refGamme = refGamme;
    }

    public void setOperations(ArrayList<Operation> opérations) {
        this.operations = opérations;
    }

    public void setEquipements(ArrayList<Equipement> equipements) {
        this.equipements = equipements;
    }

    // Constructeur
    public Gamme(String refGamme, ArrayList<Operation> operations, ArrayList<Equipement> equipements) {
        this.refGamme = refGamme;
        this.operations = operations;
        this.equipements = equipements;
    }

    // Méthodes
    public String afficherGamme(){
        String liste = "";
        for(Equipement e : this.equipements ){
            liste = liste + e.getRefEquipement();
        }
        return liste;
    }

    public float dureeGamme(){ // Calcul durée total de la gamme
        float dureeTotal = 0;
        for(Operation o : this.operations){
            dureeTotal = dureeTotal + o.getDureeOperation();
        }
        return dureeTotal;
    }

    public float coutGamme(){ // Calcul cout total de cette gamme
        float coutTotal = 0;
        for(Operation o : this.operations){
            for(Equipement e : this.equipements){
                if(e.getRefEquipement().equals(o.getRefEquipement())){
                    coutTotal += o.getDureeOperation() * e.cout();
                }
            }
        }
        return coutTotal;
    }

}
