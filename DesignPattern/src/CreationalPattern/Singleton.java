package CreationalPattern;

public class Singleton {
    // 1개만 존재해야 하는 객체의 인스턴스를 static 으로 선언
    private static Singleton instance;

    // private 으로 생성자를 선언해 외부에서 객체를 생성하는 것을 막음
    private Singleton(){ }

    // 외부에서 getInstance 함수를 통하여 instance 를 반환
    public static Singleton getInstance() {
        // instance 가 없을 때만 생성
        if (instance == null)
            instance = new Singleton();

        return instance;
    }
}

// 같은 instance 인지 Test
class Test{
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("singleton1 = " + singleton1);
        System.out.println("singleton2 = " + singleton2);
    }
}