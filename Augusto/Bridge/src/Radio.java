public class Radio implements Dispositivo {
    private boolean encendido = false;
    private int volumen = 50;
    private int canal = 1;


    @Override
    public boolean estaEncendido() {
        return encendido;
    }

    @Override
    public void encender() {
        System.out.println("encendiendo radio.... " );
        encendido = true;
    }

    @Override
    public void apagar() {
        System.out.println("apagando radio.... " );
        encendido = false;
    }

    @Override
    public int getVolumen() {
        System.out.println("el volumen de la Radio esta en: " + volumen);
        return volumen;
    }

    @Override
    public void setVolumen(int porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 100) {
            volumen = porcentaje;
            System.out.println("cambiando el volumen de la radio a: " + porcentaje);
        }
    }

    @Override
    public int getCanal() {
        System.out.println("la emisora de la radio es: " + canal);
        return canal;
    }

    @Override
    public void setCanal(int canal) {
        System.out.println("cambiando  emisora de la radio a: " + canal);
    this.canal=canal;
    }
}