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

public class fiabilite {
    public static void main(String[] args) {
        ArrayList<String> machines = new ArrayList<>();

        try (BufferedReader in = new BufferedReader(new FileReader("suiviMaintenance.txt"))) {
            String ligneLue;

            while ((ligneLue = in.readLine()) != null) {
                StringTokenizer t = new StringTokenizer(ligneLue, " ");
                
                if (t.hasMoreTokens()) {
                    String machine = t.nextToken();

                    // Vérifie si la machine est déjà dans la liste
                    if (!machines.contains(machine)) {
                        machines.add(machine);
                    }
                }
            }

            // Affichage des machines enregistrées
            System.out.println("Machines enregistrées :");
            for (String machine : machines) {
                System.out.println(machine);
            }

        } catch (IOException ex) {
            System.err.println("Erreur lors de la lecture du fichier : " + ex.getMessage());
        }
    }
}

 

 
 
 
    
    
            
            
}
