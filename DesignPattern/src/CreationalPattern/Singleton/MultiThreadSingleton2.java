package CreationalPattern.Singleton;

// 멀티스레드에서의 싱글톤2
public class MultiThreadSingleton2{
    private static MultiThreadSingleton2 instance;

    private MultiThreadSingleton2(){ }

    public static synchronized MultiThreadSingleton2 getInstance(){
        // instance 가 없을 때만 생성
        if (instance == null)
            instance = new MultiThreadSingleton2();

        return instance;
    }
}
