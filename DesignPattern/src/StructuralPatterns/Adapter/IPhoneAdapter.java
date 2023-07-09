package StructuralPatterns.Adapter;

public class IPhoneAdapter implements PhoneCharger{

    IPhone iPhone;

    public IPhoneAdapter(IPhone iPhone){
        this.iPhone = iPhone;
    }

    @Override
    public void phoneCharger() {
        iPhone.iPhoneCharge();
    }
}

