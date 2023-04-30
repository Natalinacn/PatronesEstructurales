public class MySqlDB implements Database {
    public void query(String sql) {
        System.out.println("Ejecutando la consulta '" + sql + "' en la base de datos MySQL.");
    }
}