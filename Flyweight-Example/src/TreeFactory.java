import java.util.HashMap;
import java.util.Map;
import java.util.Random;

//------------Encargado de crear los tipos arboles y chequear si un tipo de arbol ya fue creado
//------------Si ya fue creado, devuelve el creado que esta guardado en un map
public class TreeFactory {
    private static final Map<String, Tree> treeMap = new HashMap<>();

    public static Tree getTree(String tipo, int x, int y) {
        String key = tipo;
        if (treeMap.containsKey(key)) {
            System.out.print("Encontre uno ya hecho!   -");
            return treeMap.get(key);
        } else {
            Tree tree = new Tree(generarTipo(tipo));
            treeMap.put(key, tree);
            System.out.print("Creando uno nuevo         -");
            return tree;
        }
    }

    public static Treetype generarTipo(String tipo){
        int altura;
        Random azar = new Random();
        altura= azar.nextInt(200,601);
        return new Treetype(tipo,altura);
    }


}

