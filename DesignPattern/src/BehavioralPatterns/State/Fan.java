package BehavioralPatterns.State;

public class Fan {
    private AirVolumeState airVolumeState;

    public Fan(){
        this.airVolumeState = new Off();
    }

    public void setAirVolumeState(AirVolumeState airVolumeState) {
        this.airVolumeState = airVolumeState;
    }

    public void pushButton(){
        airVolumeState.push();
    }
}
