package StructuralPatterns.Adapter;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Galaxy galaxy = new Galaxy();

        PhoneCharger galaxyAdapter = new GalaxyAdapter(galaxy);

        phone.phoneCharger();
        galaxy.galaxyCharge();

        galaxyAdapter.phoneCharger();
    }
}