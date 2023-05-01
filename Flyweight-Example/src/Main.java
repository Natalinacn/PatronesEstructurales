import java.awt.*;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Random azar=new Random();
        System.out.println("\n\n\nFlyweight example:");
        System.out.println("Tenemos un terreno de 100x100 y queremos plantar arboles en el terreno");
        System.out.println("Para plantar un arbol necesitamos 3 cosas: posicion x, posicion Y, y el tipo de arbol");
        //Creamos el terreno:
        System.out.println("Nos decidimos a plantar 100 arboles. vamos a elegir una posicion al azar y chequear en ese espacio si ya hay un arbol plantado, si lo hay, elegimos otro espacio hasta que encontremos uno vacio.");
        System.out.println("Por el proposito de este ejemplo, seleccionamos un tipo de arbol al azar," +
                "\ny si no existe, le asignamos una altura permanente de este tipo (Pero aqui podria ser definido cualquier estado inmutable de la especie de arbol, como la forma o el tamaño de sus hojas, su altura maxima, etc)");
        System.out.println("Si existe, simplemente devolvemos el arbol existente en el Map de <<TreeFactory>> y nos ahorramos la creacion de otro arbol\n\n\n");
        Forest bosque= new Forest();
        for (int i = 0; i < 100; i++) {
            bosque.Plantar(generarTipo());
        }
        System.out.println("\n\nAl finalizar, el terreno tiene 100 arboles plantados, pero no creamos 100 arboles, sino 100 referencias a un puñado de arboles\n");

        }

    public static String generarTipo(){
        int tipoazar;
        String tipo;
        Random azar = new Random();
        tipoazar= azar.nextInt(1,12);
        switch (tipoazar){
            case 1:
                tipo="Acacia caven";
                break;
            case 2:
                tipo="Acacia visco";
                break;
            case 3:
                tipo="Bauhinia candicans";
                break;
            case 4:
                tipo="Jacaranda mimosifolia";
                break;
            case 5:
                tipo="Tipuana tipu";
                break;
            case 6:
                tipo="Aniba rosaeodora";
                break;
            case 7:
                tipo="Annona reticulata";
                break;
            case 8:
                tipo="Astrocaryum aculeatum";
                break;
            case 9:
                tipo="Ficus trigonata";
                break;
            case 10:
                tipo="Nectandra japurensis";
                break;
            case 11:
                tipo="Parkia pendula";
                break;
            default:
                tipo="Generico, no especifico";
                break;
        }
        return tipo;
    }
    }
