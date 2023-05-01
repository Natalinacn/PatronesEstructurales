package org.natalin.ejemploMotor;

public class MotorElectricoAdapter extends Motor{

    //Hacemos una referencia al objeto MotorElectrico que estamos adaptando
    private MotorElectrico motorElectrico;

    //Creamos un constructor que recibe como parámetro un objeto MotorElectrico.
    public MotorElectricoAdapter(MotorElectrico motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo motor eléctrico adapter.");
        this.motorElectrico.conectar();
        this.motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor eléctrico adapter.");
        this.motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor eléctrico adapter.");
        this.motorElectrico.detener();
        this.motorElectrico.desconectar();
    }
}
