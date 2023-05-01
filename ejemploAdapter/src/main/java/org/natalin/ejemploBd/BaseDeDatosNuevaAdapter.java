package org.natalin.ejemploBd;

// Clase adaptadora que permite utilizar la nueva API para leer y escribir datos en la base de datos

public class BaseDeDatosNuevaAdapter implements IBaseDeDatos{
    private BaseDeDatosNueva baseDeDatosNueva;

    public BaseDeDatosNuevaAdapter(BaseDeDatosNueva baseDeDatosNueva) {
        this.baseDeDatosNueva = baseDeDatosNueva;
    }


    @Override
    public void leerDatos() {

        baseDeDatosNueva.recuperarDatos();
    }

    @Override
    public void escribirDatos() {

        baseDeDatosNueva.guardarDatos();
    }
}
