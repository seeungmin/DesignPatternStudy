package StructuralPatterns.Adapter;

public class IPhone implements IPhoneCharger{
    @Override
    public void iPhoneCharge() {
        System.out.println("아이폰을 충전중입니다.");
    }
}
