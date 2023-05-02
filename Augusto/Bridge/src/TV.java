public class TV implements Dispositivo {
    private boolean encendido = false;
    private int volumen = 30;
    private int canal = 1;
    public boolean estaEncendido() {
        return encendido;
    }

    public void encender() {
        System.out.println("encendiendo tv... " );
        encendido = true;
    }

    public void apagar() {
        System.out.println("apagando tv... " );
        encendido = false;

    }

    public int getVolumen() {
        System.out.println("el volumen de la tv esta en: " + volumen);
        return volumen;
    }

    public void setVolumen(int porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 100) {
            volumen = porcentaje;
            System.out.println("cambiando el volumen de la tv a: " + porcentaje);
        }
    }

    public int getCanal() {
        System.out.println("el canal de la tv es: " + canal);
        return canal;
    }

    public void setCanal(int canal) {
        System.out.println("cambiando el canal de la tv a: " + canal);
        this.canal = canal;
    }
}