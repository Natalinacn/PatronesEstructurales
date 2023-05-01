public class Caja {
    private static double dineroEnCaja;
    //----Constructores
    public Caja(double dineroEnCaja) {
        this.dineroEnCaja = dineroEnCaja;
    }
    public Caja() {
        this.dineroEnCaja = 0;
    }
    //----Getters & setters
    public double getDineroEnCaja() {
        return dineroEnCaja;
    }

    public void setDineroEnCaja(double dineroEnCaja) {
        this.dineroEnCaja = dineroEnCaja;
    }
    //----Metodos
    public void cobrar(double monto){
        dineroEnCaja+=monto;
        System.out.println("pago exitoso! tenga un buen dia.");
    }
}
