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
    private ArrayList<Operation> opérations;
    private ArrayList<Equipement> equipements;

    public String getRefGamme() {
        return refGamme;
    }

    public ArrayList<Operation> getOpérations() {
        return opérations;
    }

    public ArrayList<Equipement> getEquipements() {
        return equipements;
    }

    public void setRefGamme(String refGamme) {
        this.refGamme = refGamme;
    }

    public void setOpérations(ArrayList<Operation> opérations) {
        this.opérations = opérations;
    }

    public void setEquipements(ArrayList<Equipement> equipements) {
        this.equipements = equipements;
    }

    public Gamme(String refGamme, ArrayList<Operation> opérations, ArrayList<Equipement> equipements) {
        this.refGamme = refGamme;
        this.opérations = opérations;
        this.equipements = equipements;
    }
    
}
