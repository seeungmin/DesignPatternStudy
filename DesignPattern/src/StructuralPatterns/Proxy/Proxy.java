package StructuralPatterns.Proxy;

public class Proxy implements Image{
    private RealImage realImage;

    public Proxy(RealImage realImage){
        this.realImage = realImage;
    }

    @Override
    public void showImage() {
        realImage.showImage();
        System.out.println("프록시 객체 실행!");
    }
}
