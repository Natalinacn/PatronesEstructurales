public class MongoDBAdapter implements Database{

    private MongoDB mongoDB;

    public MongoDBAdapter(MongoDB mongoDB) {
        this.mongoDB = mongoDB;
    }

    @Override
    public void query(String sql) {
        mongoDB.executeQuery(sql);

    }
}
