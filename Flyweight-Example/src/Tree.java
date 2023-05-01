import java.awt.*;

public class Tree {

    private Treetype tipo;
    public Tree (Treetype T){
        this.tipo=T;
    }
    public void PlantarArbol(){
        System.out.println("Plantando un arbol de tipo: "+tipo.getNombreArbol()+" De altura: "+tipo.getAltura()+" cm");
    }

}
