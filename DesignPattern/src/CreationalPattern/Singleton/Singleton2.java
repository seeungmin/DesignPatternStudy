package CreationalPattern.Singleton;

// 멀티스레드에서의 싱글톤1
public class Singleton2 {
    // 초기에 static 변수로 singleton 인스턴스를 생성
    private static Singleton2 instance = new Singleton2();

    private Singleton2(){ }

    public static Singleton2 getInstance(){
        return instance;
    }
}