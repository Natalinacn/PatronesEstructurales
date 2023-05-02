public class ImagenReal implements Imagen{
        private String fileName;

        public ImagenReal(String fileName){
            this.fileName = fileName;
            loadFromDisk(fileName);
        }

        @Override
        public void display() {
            System.out.println("Mostrando " + fileName);
        }

        private void loadFromDisk(String fileName){
            System.out.println("Cargando " + fileName);
        }
}
