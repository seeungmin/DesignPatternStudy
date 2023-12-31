package StructuralPatterns.Proxy;

public class Client {
    public static void main(String[] args) {
        Image image = new Proxy(new RealImage());
        Image image1 = new VirtualProxy();
        Image image2 = new ProtectionProxy(new RealImage(), true);

        image.showImage();
        image1.showImage();
        image2.showImage();
    }
}
