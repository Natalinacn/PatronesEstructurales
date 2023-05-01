package org.natalin.ejemploMotor;

public class MotorDiesel extends Motor{

    @Override
    public void encender() {
        System.out.println("Encendiendo motor diesel");

    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor diesel");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor diesel");
    }
}
