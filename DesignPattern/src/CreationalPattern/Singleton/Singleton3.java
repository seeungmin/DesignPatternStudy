package CreationalPattern.Singleton;

public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3(){ }

    public static Singleton3 getInstance(){
        if (instance == null){
            synchronized (Singleton3.class){
                instance = new Singleton3();
            }
        }

        return instance;
    }
}
