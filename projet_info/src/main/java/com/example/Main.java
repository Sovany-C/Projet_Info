package com.example;


public class Main {
    public static void main(String[] args) {
        Atelier atelier = new Atelier("atelier1");

        Machine M01 = new Machine("EP01", "def", "M01", null, null, 0, 0, 4);
        Machine M02 = new Machine("EP02", "def", "M02", null, null, 1, 0, 3);
        Machine M03 = new Machine("EP03", "def", "M03", null, null, 2, 0, 2);
        Machine M04 = new Machine("EP03", "def", "M04", null, null, 2, 1, 5);

        Poste P01 = new Poste("EP05", "def", "P01", null);
        Poste P02 = new Poste("EP06", "def", "P02", null);

        atelier.addEq(M01);
        atelier.addEq(M02);
        atelier.addEq(M03);
        atelier.addEq(M04);
        atelier.addEq(P01);
        atelier.addEq(P02);

        P01.addMachine(M04);
        P01.addMachine(M01);

        P02.addMachine(M02);
        P02.addMachine(M01);
        P02.addMachine(M03);

        System.out.println(M01.affiche());
        System.out.println(P01.affiche());

        P01.supprMachine(M04);
        System.out.println(P01.affiche());

    }

    
}