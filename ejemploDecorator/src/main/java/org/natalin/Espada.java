package org.natalin;

public class Espada extends Decorador{

    public Espada(Personaje personaje){

        super(personaje);
    }

    public Integer atacar() {
        return super.atacar() + 3; //Aumenta el daño en 3 puntos
    }
}
