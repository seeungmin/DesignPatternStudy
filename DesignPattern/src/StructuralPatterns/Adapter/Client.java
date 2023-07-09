package StructuralPatterns.Adapter;

public class Client {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        Galaxy galaxy = new Galaxy();
        GalaxyCharger iphoneAdapter = new IPhoneAdapter(iPhone);

        iphoneAdapter.galaxyCharge();
        galaxy.galaxyCharge();
        iPhone.iPhoneCharge();
    }
}
