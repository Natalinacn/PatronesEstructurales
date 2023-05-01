class ControlRemotoAvanzado extends ControlRemoto {

    public ControlRemotoAvanzado(Dispositivo dispositivo) {


        super(dispositivo);
        System.out.println("estamos creando un control remoto avanzado");
    }

    public void mute() {
        dispositivo.setVolumen(0);
    }

    public void record() {
        System.out.println("grabando programa.");
    }

}

