package org.natalin;

public abstract class Decorador implements Personaje{

    protected Personaje personaje;

    public Decorador(Personaje personaje) {

        this.personaje = personaje;
    }

    public Integer atacar() {

        return personaje.atacar();
    }


}
