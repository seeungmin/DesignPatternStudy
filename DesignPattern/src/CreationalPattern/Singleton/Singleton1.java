package CreationalPattern.Singleton;

// 멀티스레드에서의 싱글톤2
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1(){ }

    public static synchronized Singleton1 getInstance(){
        // instance 가 없을 때만 생성
        if (instance == null)
            instance = new Singleton1();

        return instance;
    }
}
