package BehavioralPatterns.State;

public class Client {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Low low = new Low();
        Middle middle = new Middle();
        High high = new High();
        Off off = new Off();

        fan.pushButton();
        fan.setAirVolumeState(low);
        fan.pushButton();
        fan.setAirVolumeState(middle);
        fan.pushButton();
        fan.setAirVolumeState(high);
        fan.pushButton();
        fan.setAirVolumeState(off);
        fan.pushButton();
    }
}
