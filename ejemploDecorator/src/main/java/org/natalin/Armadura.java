package org.natalin;

public class Armadura extends Decorador{

    public Armadura(Personaje personaje){
        super(personaje);

    }

    public Integer atacar(){

        return super.atacar() + 5; //Aumenta el daño en 5 puntos
    }
}
