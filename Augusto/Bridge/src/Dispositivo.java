public interface Dispositivo {
    public boolean estaEncendido();
    public void encender();

    public void apagar();

    public int getVolumen();

    public void setVolumen(int porcentaje);

    public int getCanal();

    public void setCanal(int canal);

}
