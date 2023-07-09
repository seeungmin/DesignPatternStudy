package StructuralPatterns.Adapter;

public class Galaxy implements GalaxyCharger{
    @Override
    public void galaxyCharge() {
        System.out.println("갤럭시를충전중입니다.");
    }
}
