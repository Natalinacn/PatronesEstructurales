package org.natalin.ejemploBd;

public class Main {

    public static void main(String[] args) {

        // Utilizamos la base de datos antigua

        IBaseDeDatos bdAntigua = new BaseDeDatosAntigua();
        bdAntigua.leerDatos();
        bdAntigua.escribirDatos();

        // Utilizamos el adaptador para la nueva base de datos

        BaseDeDatosNueva bdNueva = new BaseDeDatosNueva();
        IBaseDeDatos bdNuevaAdapter = new BaseDeDatosNuevaAdapter(bdNueva);
        bdNuevaAdapter.leerDatos();
        bdNuevaAdapter.escribirDatos();
    }
}
