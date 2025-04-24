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

        lectureMachine(atelier);
        lecturePoste(atelier);

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
    public static void lectureMachine(Atelier atelier){
        String refEquipement, dEquipement,refMachine,dMachine,type;
        float x,y,cout;
        String[] mots;

        try{
            BufferedReader flux=new BufferedReader(new FileReader("Machines.txt"));
            String lignelue;
            while((lignelue=flux.readLine())!=null){
    
                //* -Décomposer une chaine de caratères avec la méthode split de la classe String
                mots = lignelue.split(" ");
                refEquipement = mots[0];
                dEquipement = mots[1];
                refMachine = mots[2];
                dMachine = mots[3];
                type = mots[4];
                x = Float.valueOf(mots[5]);
                y = Float.valueOf(mots[6]);
                cout = Float.valueOf(mots[7]);

                creationMachine(atelier, refEquipement, dEquipement, refMachine, dMachine, type, x, y, cout);
            }
            flux.close();
        }
        catch(FileNotFoundException err){
            System.out.println("Erreur :le fichier n’existe pas!\n "+err);}
            
        catch(IOException err){
            System.out.println("Erreur :\n"+err);}

    }

    public static void creationPoste(Atelier atelier, String refEquipement, String dEquipement,String refPoste, 
    String dPoste, Set<Machine> machines){
        Poste poste = new Poste(refEquipement, dEquipement, refPoste, dPoste, machines);
        atelier.addEq(poste);
    }
    public static void lecturePoste(Atelier atelier){
        String refEquipement, dEquipement,refPoste,dPoste;
        String[] machines;
        Set<Machine> machinePoste = new HashSet<>();
        String[] mots;

        try{
            BufferedReader flux=new BufferedReader(new FileReader("Poste.txt"));
            String lignelue;
            while((lignelue=flux.readLine())!=null){
    
                //* -Décomposer une chaine de caratères avec la méthode split de la classe String
                mots = lignelue.split(" ");
                refEquipement = mots[0];
                dEquipement = mots[1];
                refPoste = mots[2];
                dPoste = mots[3];
                machines = mots[4].split(",");

                for(Equipement e : atelier.getEquipements()){
                    if(e instanceof Machine){
                        Machine m = (Machine) e;
                        for(String ref : machines){
                            if(m.getRefMachine().equals(ref)){
                                machinePoste.add(m);
                                break;
                            }
                        }
                    }
                }

                creationPoste(atelier, refEquipement, dEquipement, refPoste, dPoste, machinePoste);
                machinePoste.clear();
            }
            flux.close();
        }
        catch(FileNotFoundException err){
            System.out.println("Erreur :le fichier n’existe pas!\n "+err);}
            
        catch(IOException err){
            System.out.println("Erreur :\n"+err);}

    }

    
}