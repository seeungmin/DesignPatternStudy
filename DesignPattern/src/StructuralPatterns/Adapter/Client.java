package StructuralPatterns.Adapter;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        IPhone iPhone = new IPhone();
        Galaxy galaxy = new Galaxy();

        PhoneCharger iphoneAdapter = new IPhoneAdapter(iPhone);
        PhoneCharger galaxyAdapter = new GalaxyAdapter(galaxy);

        phone.phoneCharger();
        iPhone.iPhoneCharge();
        galaxy.galaxyCharge();

        iphoneAdapter.phoneCharger();
        galaxyAdapter.phoneCharger();

    }
}
