public class OracleDBAdapter implements Database {
    private OracleDB oracleDatabase;

    public OracleDBAdapter(OracleDB oracleDatabase) {
        this.oracleDatabase = oracleDatabase;
    }

    public void query(String sql) {
        oracleDatabase.executeQuery(sql);
    }
}