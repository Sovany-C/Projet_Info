package com.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Lecture {
    
    public static void lecturePoste(Atelier atelier){
        String refEquipement, dEquipement,refPoste,dPoste;
        String[] machines;
        Set<Machine> machinePoste = new HashSet<>();
        String[] mots;

        try{
            BufferedReader flux=new BufferedReader(new FileReader("C:\\Users\\Java\\..\\examples\\Poste.txt"));
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

                Poste p = new Poste(refEquipement, dEquipement, refPoste, dPoste, machinePoste);
                atelier.addEq(p);
                machinePoste.clear();
            }
            flux.close();
        }
        catch(FileNotFoundException err){
            System.out.println("Erreur :le fichier n’existe pas!\n "+err);}
            
        catch(IOException err){
            System.out.println("Erreur :\n"+err);}

    }

    public static void lectureMachine(Atelier atelier){
        String refEquipement, dEquipement,refMachine,dMachine,type;
        float x,y,cout;
        String[] mots;

        try{
            BufferedReader flux=new BufferedReader(new FileReader("C:\\Users\\camil\\Documents\\Informatique\\Projet_S2\\Projet_Info\\projet_info\\src\\main\\java\\com\\example\\Machines.txt"));
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

                Machine m = new Machine(refEquipement, dEquipement, refMachine, dMachine, type, x, y, cout);
                atelier.addEq(m);
            }
            flux.close();
        }
        catch(FileNotFoundException err){
            System.out.println("Erreur :le fichier n’existe pas!\n "+err);}
            
        catch(IOException err){
            System.out.println("Erreur :\n"+err);}

    }

}
