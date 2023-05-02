public class ControlRemoto {
    protected Dispositivo dispositivo;

    public ControlRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void encenderApagar() {
        if (dispositivo.estaEncendido()) {
            dispositivo.apagar();
        } else {
            dispositivo.encender();
        }
    }

    public void subirVolumen() {
        dispositivo.setVolumen(dispositivo.getVolumen() + 10);
    }

    public void bajarVolumen() {
        dispositivo.setVolumen(dispositivo.getVolumen() - 10);
    }

    public void canalSiguiente() {
        dispositivo.setCanal(dispositivo.getCanal() + 1);
    }

    public void canalAnterior() {
        dispositivo.setCanal(dispositivo.getCanal() - 1);
    }
}
