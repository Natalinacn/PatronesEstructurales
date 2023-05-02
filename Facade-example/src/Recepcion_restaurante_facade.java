import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Recepcion_restaurante_facade {
    private static double Cobro;

    public Recepcion_restaurante_facade() {
    }

    public double getCobro() {
        return Cobro;
    }

    public void setCobro(double cobro) {
        Cobro = cobro;
    }
    public  void AtenderCliente(Cocina Co, Reservaciones Re, Caja Cj) {

        Random azar = new Random();
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido! dejeme asignarle su mesa, y lo atenderemos en seguida.");
        if (Re.getMesasOcupadas() < 25) {
            Re.Reservar();
            System.out.println("Que va a pedir hoy?:");

            boolean siTenemos;
            do {
                String pedido = leer.nextLine();
                siTenemos = Co.Cocinar(pedido);
                if (siTenemos) {
                    System.out.println("En seguida!");
                    Cobro = (azar.nextInt(6) + 1) * 300;
                    System.out.println("Aqui tiene! en total serian: "+Cobro+"$");
                    Cj.cobrar(Cobro);
                } else {
                    System.out.println("Perdon! no hacemos ese plato, intente nuevamente! (Le sugiero probar ´Milanesa')");
                }
            } while (!siTenemos);
        }else{
            System.out.println("Lo lamento! el restaurante esta lleno, vuelva mas tarde");
        }
    }
}
