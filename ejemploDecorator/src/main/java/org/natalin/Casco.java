package org.natalin;

public class Casco extends Decorador{

    public Casco(Personaje personaje){

        super(personaje);
    }

    public Integer atacar() {
        return super.atacar() + 3; //Aumenta el daño en 3 puntos
    }
}
