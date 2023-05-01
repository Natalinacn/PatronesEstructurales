public class Mesa {
    private boolean ocupada;
    private int fila;
    private int columna;

    public Mesa() {
    }


    public Mesa(int fila, int columna) {
        this.ocupada = false;
        this.fila = fila;
        this.columna = columna;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
}
