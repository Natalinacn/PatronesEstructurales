public class Main {
    public static void main(String[] args) {

        Trabajador t1 = new Trabajador("Juan", 1000);
        Trabajador t2 = new Trabajador("Pedro", 1200);
        Gerente g1 = new Gerente("María", 2000);
        g1.agregarSubordinado(t1);
        g1.agregarSubordinado(t2);
        Trabajador t3 = new Trabajador("Luis", 1100);
        Gerente g2 = new Gerente("Ana", 2500);
        g2.agregarSubordinado(t3);
        g2.agregarSubordinado(g1);
        System.out.println("Salario de " + g2.getNombre() + ": " + g2.obtenerSueldo());
    }
}