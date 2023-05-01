import java.util.Random;

public class Forest {

    public TreePlot[][] Tierra100x100;
    public Forest(){
        TreePlot[][] Tierra = new TreePlot[100][100];
        for (int i = 0; i <100; i++) {
            for (int j = 0; j <100 ; j++) {
                Tierra[i][j] = new TreePlot();

            }

        }
        this.Tierra100x100=Tierra;
    }

    public TreePlot[][] getTierra100x100() {
        return Tierra100x100;
    }

    public void setTierra100x100(TreePlot[][] tierra100x100) {
        Tierra100x100 = tierra100x100;
    }

    public void Plantar(String tipo) {
        Random azar = new Random();
        boolean works= false;
        do {
            int x = azar.nextInt(100);
            int y = azar.nextInt(100);
            if (!this.Tierra100x100[x][y].isOccupied()) {
                this.Tierra100x100[x][y].setTree(TreeFactory.getTree(tipo, x, y));
                this.Tierra100x100[x][y].setOccupied(true);
                this.Tierra100x100[x][y].getTree().PlantarArbol();
                works=true;
            }
        }while(works=false);
    }


}
