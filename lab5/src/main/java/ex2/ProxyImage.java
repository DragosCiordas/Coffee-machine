package ex2;

public class ProxyImage implements Image {

    private Image Image;
    private String fileName;
    private boolean k = true;

    public ProxyImage(String fileName, boolean k) {
        this.fileName = fileName;
        this.k = k;
    }

    @Override
    public void display() {
        if (Image == null) {
            if (k)
            {Image = new RealImage(fileName);}
            else {Image = new RotatedImage(fileName);}
        }
        Image.display();
    }


}