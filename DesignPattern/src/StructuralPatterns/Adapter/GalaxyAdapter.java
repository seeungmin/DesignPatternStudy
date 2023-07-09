package StructuralPatterns.Adapter;

public class GalaxyAdapter implements PhoneCharger{
    Galaxy galaxy;

    public GalaxyAdapter(Galaxy galaxy){
        this.galaxy = galaxy;
    }

    @Override
    public void phoneCharger() {
        galaxy.galaxyCharge();
    }
}
