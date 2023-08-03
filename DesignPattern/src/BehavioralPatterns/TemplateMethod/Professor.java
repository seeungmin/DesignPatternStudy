package BehavioralPatterns.TemplateMethod;

public abstract class Professor {
    public void startClass(){
        comeIn();
        callAttendance();
        teach();
        goOut();
    }

    public void comeIn(){
        System.out.println("교수님이 들어오신다.");
    }

    public void callAttendance(){
        System.out.println("교수님이 출석을 부르신다.");
    }

    public void goOut(){
        System.out.println("교수님이 나가신다.");
    }

    public abstract void teach();
}