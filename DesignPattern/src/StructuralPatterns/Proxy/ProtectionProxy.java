package StructuralPatterns.Proxy;

public class ProtectionProxy implements Image{
    private RealImage realImage;
    boolean access;

    public ProtectionProxy(RealImage realImage, boolean access){
        this.realImage = realImage;
        this.access = access;
    }

    @Override
    public void showImage() {
        if(access){
            realImage.showImage();
            System.out.println("프록시 객체 실행!");
        }
    }
}
