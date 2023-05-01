package org.natalin;

public class Main {
    public static void main(String[] args) {


        Personaje guerreroConArmaduraYCasco = new Casco(new Armadura(new Guerrero()));

        Personaje guerreroBasico = new Guerrero();

        Personaje guerreroConArmadura = new Armadura(new Guerrero());

        Personaje guerreroConCasco = new Casco(new Guerrero());

        System.out.println("Guerrero con armadura y casco causa daño " + guerreroConArmaduraYCasco.atacar());
        System.out.println("Guerrero con armadura causa daño " +guerreroConArmadura.atacar());
        System.out.println("Guerrero con casco causa daño " + guerreroConCasco.atacar());
        System.out.println("Guerrero básico causa daño " +guerreroBasico.atacar());



    }
}