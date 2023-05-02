public class TreePlot {
    //-----------El lugar donde un arbol se planta, contiene el boolean si esta ocupado, y el arbol que lo ocupa
    private boolean occupied;
    private Tree tree;
    public TreePlot(){
        this.occupied=false;
    }
    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public Tree getTree() {
        return tree;
    }

    public void setTree(Tree tree) {
        this.tree = tree;
    }
}
