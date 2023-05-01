public class Trabajador implements Empleado{

    private String nombre;
    private double salarioBase;

    public Trabajador(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }


    @Override
    public double obtenerSueldo() {
        return salarioBase;
    }
}
