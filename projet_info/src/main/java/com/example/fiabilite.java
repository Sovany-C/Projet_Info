/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;



/**
 *
 * @author arthu
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class fiabilite{

    public static Machine[]calculfiab( Atelier atelier){
    ArrayList<Machine> Liste = atelier.getMachine();
    
    int n=Liste.size();
    Machine[]M= new Machine[n+100];
    int e=0;
    
    
    try (BufferedReader in = new BufferedReader(new FileReader(suiviMaintenance.txt))) {
        String ligne;
        while ((ligne = in.readLine()) != null) {
            StringTokenizer t = new StringTokenizer(ligne, " ");
            String date = t.nextToken();
            String heure = t.nextToken();
            String ref = t.nextToken(); // machine
            String event = t.nextToken();
            String operateur = t.nextToken();
            String cause = t.nextToken();

            boolean ajouter = true;
    
    
    }


 

 
 
 
    
    
            
            
}
