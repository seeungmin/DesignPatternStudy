package CreationalPattern.Singleton;

// 멀티스레드에서의 싱글톤1
public class MultiThreadSingleton1{
    // 초기에 static 변수로 singleton 인스턴스를 생성
    private static MultiThreadSingleton1 instance = new MultiThreadSingleton1();

    private MultiThreadSingleton1(){ }

    public static MultiThreadSingleton1 getInstance(){
        return instance;
    }
}