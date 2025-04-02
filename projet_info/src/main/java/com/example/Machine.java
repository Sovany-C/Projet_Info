package com.example;
import java.util.Scanner;

public class Machine extends Equipement{
    private String refMachine;
    private String dMachine;
    private String type;
    private float x;
    private float y;
    private float cout;

    // Getters & Setters
    public String getRefMachine() {
        return refMachine;
    }
    public void setRefMachine(String refMachine) {
        this.refMachine = refMachine;
    }
    public String getdMachine() {
        return dMachine;
    }
    public void setdMachine(String dMachine) {
        this.dMachine = dMachine;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public float getCout() {
        return cout;
    }
    public void setCout(float cout) {
        this.cout = cout;
    }

    
    public Machine(String refEquipement, String dEquipement, String refMachine, String dMachine, String type, float x,
            float y, float cout) {
        super(refEquipement, dEquipement);
        this.refMachine = refMachine;
        this.dMachine = dMachine;
        this.type = type;
        this.x = x;
        this.y = y;
        this.cout = cout;
    }

    // Methodes
    public String affiche(){
        return "Reférence machine : " + this.refMachine + " | désignation : " + this.dMachine + " | type : " + this.type + " | coordonnées"
        + this.x + "," + this.y + " | cout horaire : " + this.cout;
    }

    public void modifier(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Taper 1 pour modifier la reférence, 2 pour la désignation, 3 pour le type, 4 pour les coordonnées, 5 pour le cout, O pour sortir");
        int choix = sc.nextInt();
        switch (choix) {
            case 1:
                System.out.println("Nouvelle ref");
                String ref = sc.nextLine();
                this.setRefMachine(ref);
                break;
            case 2 :
                System.out.println("Nouvelle désignation");
                String def = sc.nextLine();
                this.setdMachine(def);
                break;
            case 3 :
                System.out.println("Type");
                String type = sc.nextLine();
                this.setType(type);
                break;
            case 4 :
                System.out.println("Coordonnées");
                float x = sc.nextFloat();
                float y = sc.nextFloat();
                this.setX(x);
                this.setY(y);
                break;
            case 5 :
                System.out.println("cout");
                float cout = sc.nextFloat();
                this.setCout(cout);
                break;
            default:
                return;
        }
        return;
    }
    public void supprimer(){

    }
    
}
