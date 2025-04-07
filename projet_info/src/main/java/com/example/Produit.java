/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;
import java.util.Scanner;

/**
 *
 * @author anato
 */
public class Produit {
    private String codeProduit;
    private String dProduit;

    // Getters & Setters
    public String getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(String codeProduit) {
        this.codeProduit = codeProduit;
    }

    public String getdProduit() {
        return dProduit;
    }

    public void setdProduit(String dProduit) {
        this.dProduit = dProduit;
    }

    // Constructeur
    public Produit(String codeProduit, String dProduit) {
        this.codeProduit = codeProduit;
        this.dProduit = dProduit;
    }

    // Méthodes
    public String afficheProduit(){
        return "Code produit: " + this.codeProduit + " | Désignation: " + this.dProduit;
    }

    public void modifierProduit(){
        System.out.println("Tapez 1 pour modifier le code produit, tapez 2 pour modifier la désignation");
        Scanner sc = new Scanner(System.in);
        int nombre = sc.nextInt();
        String modif;
        if(nombre == 1){
            System.out.println("Tapez votre modification");
            modif = sc.nextLine();
            this.setCodeProduit(modif);
        }
        if(nombre == 2){
            System.out.println("Tapez votre modification");
            modif = sc.nextLine();
            this.setdProduit(modif);
        }
        sc.close();
    }


    
}
