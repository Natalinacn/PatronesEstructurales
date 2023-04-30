import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        // Creamos una lista de objetos que implementan la interfaz Database.
        List<Database> databases = new ArrayList<>();

        // Agregamos una instancia de MySqlDB a la lista.
        databases.add(new MySqlDB());

        // Creamos una instancia de OracleDB y la envolvemos en un adaptador.
        OracleDB oracleDatabase = new OracleDB();
        databases.add(new OracleDBAdapter(oracleDatabase));

        MongoDB mongoDatabase = new MongoDB();
        databases.add(new MongoDBAdapter(mongoDatabase));

        // Recorremos la lista y ejecutamos consultas en cada base de datos.
        for (Database database : databases) {
            database.query("SELECT * FROM users");
        }
    }
}
