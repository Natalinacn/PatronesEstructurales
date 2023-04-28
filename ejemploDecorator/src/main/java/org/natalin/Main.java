package org.natalin;

public class Main {
    public static void main(String[] args) {


        Personaje guerreroConArmaduraYCasco = new Casco(new Armadura(new Guerrero()));

        Personaje guerreroBasico = new Guerrero();

        Personaje guerreroConArmadura = new Armadura(new Guerrero());

        Personaje guerreroConCasco = new Casco(new Guerrero());

        System.out.println(guerreroConArmaduraYCasco.atacar());
        System.out.println(guerreroConArmadura.atacar());
        System.out.println(guerreroConCasco.atacar());
        System.out.println(guerreroBasico.atacar());



    }
}