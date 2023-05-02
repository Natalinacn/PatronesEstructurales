package org.natalin.ejemploBd;


// Clase que implementa la interfaz BaseDeDatos utilizando una API antigua
public class BaseDeDatosAntigua implements IBaseDeDatos{

    @Override
    public void leerDatos() {
        System.out.println("Leyendo datos de la base de datos antigua...");
    }

    @Override
    public void escribirDatos() {
        System.out.println("Escribiendo datos en la base de datos antigua...");
    }
}
