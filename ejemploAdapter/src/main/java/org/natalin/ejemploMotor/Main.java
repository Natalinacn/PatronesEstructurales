package org.natalin.ejemploMotor;

public class Main {

    public static void main(String[] args) {

        Motor motor1 = new MotorDiesel();
        Motor motor2 = new MotorComun();
        Motor motor3 = new MotorElectricoAdapter(new MotorElectrico());

        motor1.encender();
        motor1.acelerar();
        motor1.apagar();

        motor2.encender();
        motor2.acelerar();
        motor2.apagar();

        motor3.encender();
        motor3.acelerar();
        motor3.apagar();

    }
}
