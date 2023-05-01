public class ImagenProxy implements Imagen{
        private ImagenReal realImage;
        private String fileName;

        public ImagenProxy(String fileName){
            this.fileName = fileName;
        }

        @Override
        public void display() {
            if(realImage == null){
                realImage = new ImagenReal(fileName);
            }
            realImage.display();
        }
    }

