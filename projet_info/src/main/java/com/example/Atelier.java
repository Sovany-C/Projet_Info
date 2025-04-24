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
public class Atelier {
    private String nom;
    private ArrayList<Equipement> equipements;
    private ArrayList<Produit> produits;

    // Getters & Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Equipement> getEquipements(){
        return equipements;
    }
   
    public void setEquipements(ArrayList<Equipement> equipements){
        this.equipements = equipements;
    }

    public ArrayList<Produit> getProduits() {
        return produits;
    }

    public void setProduits(ArrayList<Produit> produits) {
        this.produits = produits;
    }

    // Constructeur
    public Atelier(String nom) {
        this.nom = nom;
        this.equipements = new ArrayList<Equipement>();
        this.produits = new ArrayList<Produit>();
    }
    
    // Méthode
    public void addEq(Equipement e){
        this.equipements.add(e);
    }

    public String affiche(){
        ArrayList<String> refEq = new ArrayList<>();
        for(Equipement e: this.equipements){
            refEq.add(e.getRefEquipement());
        }
        return "Nom : " + this.nom + " | Equipement: " + refEq;
    }

    

    
}
