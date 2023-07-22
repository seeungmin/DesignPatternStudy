package StructuralPatterns.Proxy;

public class Client {
    public static void main(String[] args) {
        Image image = new Proxy(new RealImage());
        image.showImage();
    }
}
