package StructuralPatterns.Proxy;

public class VirtualProxy implements Image{
    private RealImage realImage;

    public VirtualProxy(){}

    @Override
    public void showImage() {
        if(realImage == null){
            realImage = new RealImage();
        }
        realImage.showImage();

        System.out.println("프록시 객체 실행!");
    }
}
