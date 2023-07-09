package StructuralPatterns.Adapter;

public class Phone implements PhoneCharger{
    @Override
    public void phoneCharger() {
        System.out.println("휴대폰을 충전중입니다.");
    }
}
