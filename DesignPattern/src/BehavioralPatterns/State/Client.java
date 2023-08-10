package BehavioralPatterns.State;

public class Client {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Low low = new Low();
        Middle middle = new Middle();
        High high = new High();
        Off off = new Off();

        fan.push();
        fan.setAirVolumeState(low);
        fan.push();
        fan.setAirVolumeState(middle);
        fan.push();
        fan.setAirVolumeState(high);
        fan.push();
        fan.setAirVolumeState(off);
        fan.push();
    }
}
