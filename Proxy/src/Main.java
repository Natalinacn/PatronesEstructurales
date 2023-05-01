// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
    //Proxy remoto: Maneja la comunicacion entre el cliente y el objeto remoto, esconde los detalles de la conexion y protocolo
    // El cliente se comunica con el proxy como si fuese el objeto real, pero es el proxy quien se comunica con el objeto

    //Proxy Virtual: un <<placeholder>> ocupa el lugar del objeto, que cuesta una cantidad considerable de recursos, hasta que este deba ser renderizado.
    // retrasa su creacion hasta que sea necesitado

    //Proxy de proteccion: Limita el acceso al objeto hasta que las condiciones sean cumplidas (Como la confirmacion de cuenta/usuario)

    //Proxy de Cache: Guarda una instancia cache de un objeto o Query realizada, y la retorna rapidamente si se hace de nuevo.
    //Ahorra tiempo y recursos ahorrando trabajo redundante y trafico en red

    //Proxy intermedio: Guarda los mensajes y la informacion sobre los llamados a su objeto, como el nombre del metodo, los parametros, los resultados, etc.
    //Su funcion principal es monitorear y controlar, ya sea por performance, para debugging, o simple revision.



                Imagen imagen = new ImagenProxy("test.jpg");
                System.out.println("\nLa imagen proxy ya fue creada, pero continua siendo solo un proxy hasta que necesite ser mostrada\n");
                System.out.println("\nSi la imagen necesita ser mostrada, del elemento proxy se crea una imagen real, y se muestra\n");
                imagen.display();
                System.out.println("La imagen no es cargada nuevamente.");
                imagen.display();
            }
        }

