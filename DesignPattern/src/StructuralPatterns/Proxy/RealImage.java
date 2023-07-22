package StructuralPatterns.Proxy;

public class RealImage implements Image{

    @Override
    public void showImage() {
        System.out.println("원본 이미지 보여주기!");
    }
}
