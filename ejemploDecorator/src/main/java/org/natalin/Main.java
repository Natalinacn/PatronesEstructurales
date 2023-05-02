package org.natalin;

public class Main {
    public static void main(String[] args) {

        Personaje guerreroBasico = new Guerrero();

        Personaje guerreroConEspada = new Espada(new Guerrero());

        Personaje guerreroConArmadura = new Armadura(new Guerrero());

        Personaje guerreroConArmaduraYEspada = new Espada(new Armadura(new Guerrero()));

        System.out.println("Guerrero básico causa daño " +guerreroBasico.atacar());
        System.out.println("Guerrero con espada causa daño " + guerreroConEspada.atacar());
        System.out.println("Guerrero con armadura causa daño " +guerreroConArmadura.atacar());
        System.out.println("Guerrero con armadura y espada causa daño " + guerreroConArmaduraYEspada.atacar());

    }
}