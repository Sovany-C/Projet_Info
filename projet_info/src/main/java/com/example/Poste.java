/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author arthu
 */
public class Poste extends Equipement {
    private String refPoste;
    private String dPoste;
    private Set<Machine> machines;

    public String getRefPoste() {
        return refPoste;
    }

    public String getdPoste() {
        return dPoste;
    }

    public Set<Machine> getMachines() {
        return machines;
    }

    public void setRefPoste(String refPoste) {
        this.refPoste = refPoste;
    }

    public void setdPoste(String dPoste) {
        this.dPoste = dPoste;
    }

    public void setMachines(Set<Machine> machines) {
        this.machines = machines;
    }

    public Poste(String refPoste, String dPoste, Set<Machine> machines, String refEquipement, String dEquipement) {
        super(refEquipement, dEquipement);
        this.refPoste = refPoste;
        this.dPoste = dPoste;
        this.machines = machines;
    }

    public String affichePoste(){
        return this.refPoste+"|"+this.dPoste+"|"+this.machines ;
    }
    public void modifierPoste(Machine m){
        System.out.println("Tapez 1 pour ajouger une machine, tapez 2 pour retirer une machine");
        Scanner sc = new Scanner(System.in);
        int nombre = sc.nextInt();
        if(nombre == 1){
            this.machines.add(m);
        }
        if(nombre == 2){
            this.machines.remove(m);
        }
    } 

}
