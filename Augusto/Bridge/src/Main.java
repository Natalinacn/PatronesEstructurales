public class Main {
    public static void main(String[] args) {

        TV Objtelevision = new TV();
        ControlRemoto controlTv = new ControlRemoto(Objtelevision);
        controlTv.encenderApagar();
        controlTv.canalAnterior();
        controlTv.canalSiguiente();
        controlTv.subirVolumen();

        System.out.println("--------------------------------------------------------");
        Radio radio = new Radio();
        ControlRemotoAvanzado controlRadio = new ControlRemotoAvanzado(radio);
        controlRadio.encenderApagar();
        controlRadio.record();
        controlRadio.subirVolumen();
        controlRadio.mute();

}
}