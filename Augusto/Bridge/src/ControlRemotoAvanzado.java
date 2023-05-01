class ControlRemotoAvanzado extends ControlRemoto {

    public ControlRemotoAvanzado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    public void mute() {
        dispositivo.setVolumen(0);
    }

    public void record() {
        System.out.println("grabando programacion...");
    }

}