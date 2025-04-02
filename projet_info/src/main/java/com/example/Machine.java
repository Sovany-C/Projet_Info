package com.example;

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

    // Methodes
    public void affiche(){}
    public void modifier(){}
    public void supprimer(){}
    
}
