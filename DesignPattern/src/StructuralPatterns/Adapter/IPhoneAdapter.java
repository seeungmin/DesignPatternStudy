package StructuralPatterns.Adapter;

public class IPhoneAdapter implements GalaxyCharger{

    IPhone iPhone;

    public IPhoneAdapter(IPhone iPhone){
        this.iPhone = iPhone;
    }

    @Override
    public void galaxyCharge() {
        iPhone.iPhoneCharge();
    }
}

