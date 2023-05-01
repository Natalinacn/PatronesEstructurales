import java.util.ArrayList;
import java.util.List;

public class Gerente implements Empleado {
    private String nombre;
    private double salarioBase;
    private List<Empleado> subordinados;

    public Gerente(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.subordinados = new ArrayList<>();
    }

    public void agregarSubordinado(Empleado empleado) {
        subordinados.add(empleado);
    }
    @Override
    public double obtenerSueldo() {
        double salarioTotal = salarioBase;
        for (Empleado empleado : subordinados) {
            salarioTotal += empleado.obtenerSueldo();
        }
        return salarioTotal;
    }
    public String getNombre() {
        return nombre;
    }
}
