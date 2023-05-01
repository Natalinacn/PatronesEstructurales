// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cocina cocina_restaurante = new Cocina();
        Reservaciones reservas_restaurante = new Reservaciones();
        Caja caja_restaurante = new Caja();

        //---Una vez inicializadas todas las partes del restaurante, se inicia y llama al Facade, que lidiara con el cliente, recibira los mensajes del cliente
        //-- y los reenviara al subsistema del restaurante.
        //--- un Patron de diseño MUY similar es el patron Mediator, pero a diferencia del mediator, Facade transmite informacion del cliente, a los componentes del sistema
        //--- Y no desde un componente a otro componente.
        Recepcion_restaurante_facade Recepcion= new Recepcion_restaurante_facade();
        Recepcion.AtenderCliente(cocina_restaurante,reservas_restaurante,caja_restaurante);
    }
}