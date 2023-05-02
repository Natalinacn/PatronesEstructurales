import java.awt.*;

public class Treetype {
private String nombreArbol;
private int alturaEnCentimetros;

    public Treetype(String nombreArbol, int alturaEnCentimetros) {
        this.nombreArbol = nombreArbol;
        this.alturaEnCentimetros=alturaEnCentimetros;
    }

    public int getAltura() {
        return this.alturaEnCentimetros;
    }

    public void setAlturaEnCentimetros(int alturaEnCentimetros) {
        this.alturaEnCentimetros=alturaEnCentimetros;
    }

    public String getNombreArbol() {
        return nombreArbol;
    }

    public void setNombreArbol(String nombreArbol) {
        this.nombreArbol = nombreArbol;
    }
}
