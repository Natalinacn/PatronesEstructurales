public class Cocina {
    public boolean Cocinar(String plato){
        boolean podemos;
        switch (plato){
            case "Sandwich", "Milanesa", "Pasta":
                podemos=true;
                break;
            default:
                podemos=false;
        }
        return podemos;
    }
}
