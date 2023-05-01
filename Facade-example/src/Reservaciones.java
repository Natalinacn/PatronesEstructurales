import java.util.Random;

public class Reservaciones {
    private static Mesa[][] mesas;
    private static int mesasOcupadas;
    public Reservaciones(){
        int filas = 4;
        int columnas=5;
        Mesa[][] lugares=new Mesa[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                lugares[i][j] = new Mesa(i,j);
            }
        }
        mesas=lugares;
        mesasOcupadas=0;
    }

    public Mesa[][] getMesas() {
        return mesas;
    }

    public void setMesas(Mesa[][] mesas) {
        Reservaciones.mesas = mesas;
    }

    public int getMesasOcupadas() {
        return mesasOcupadas;
    }

    public void setMesasOcupadas(int mesasOcupadas) {
        Reservaciones.mesasOcupadas = mesasOcupadas;
    }

    public Mesa Reservar(){
        Random azar = new Random();
        int fila;
        int columna;
        boolean encontro=false;
        do{
            fila = azar.nextInt(2);
            columna = azar.nextInt(5);
            if(!mesas[fila][columna].isOcupada()){
                mesas[fila][columna].setOcupada(true);
                int mesa = (fila*(columna+1))+columna+1;
                System.out.println("Dirijase a la mesa N°"+mesa);
                mesasOcupadas++;
                encontro=true;
            }
        }while(!encontro);
        return mesas[fila][columna];



    }
}
