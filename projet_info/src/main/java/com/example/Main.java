package com.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Atelier atelier = new Atelier("atelier1");

        Lecture.lectureMachine(atelier);
        Lecture.lecturePoste(atelier);

        for(Equipement e : atelier.getEquipements()){
            if(e instanceof Poste){
                Poste p = (Poste) e;
                p.affiche();
            }
        }
        System.out.println(atelier.affiche());
    }

    public static void creationMachine(Atelier atelier, String refEquipement, String dEquipement, String refMachine, String dMachine, String type, float x,
    float y, float cout){
        Machine machine = new Machine(refEquipement, dEquipement, refMachine, dMachine, type, x, y, cout);
        atelier.addEq(machine);
    }

    public static void creationPoste(Atelier atelier, String refEquipement, String dEquipement,String refPoste, 
    String dPoste, Set<Machine> machines){
        Poste poste = new Poste(refEquipement, dEquipement, refPoste, dPoste, machines);
        atelier.addEq(poste);
    }

    
}