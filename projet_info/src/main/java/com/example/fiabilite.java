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
 
 import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class fiabilite {
     String[] M = Machine.toArray(new String[0]); // Tableau pour stocker les machines
        int e = 0; // Compteur de machines enregistrées

        try (BufferedReader in = new BufferedReader(new FileReader("suiviMainteance.txt"))){
            String ligneLue;

            while ((ligneLue = in.readLine()) != null) {
                StringTokenizer t = new StringTokenizer(ligneLue, " ");
                String machine = t.nextToken(); // Lecture de la machine
                boolean ajouter = true;

                // Vérifie si la machine existe déjà dans le tableau
                for (int i = 0; i < e; i++) {
                    if (machine.equals(M[i])) {
                        ajouter = false;
                        break;
                    }
                }

                // Si elle n'existe pas, on l'ajoute
                if (ajouter) {
                    M[e] = machine;
                    e++;
                }
            }

            // Affichage des machines enregistrées
            System.out.println("Machines enregistrées :");
            for (int i = 0; i < e; i++) {
                System.out.println(M[i]);
            }

        } catch (IOException ex) {
            System.err.println("Erreur lors de la lecture du fichier : " + ex.getMessage());
        }
    }


 
 
 
    
    
            
            
}
