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


// 멀티스레드에서의 싱글톤1
class MultiThreadSingleton1{
    // 초기에 static 변수로 singleton 인스턴스를 생성
    private static MultiThreadSingleton1 instance = new MultiThreadSingleton1();

    private MultiThreadSingleton1(){ }

    public static MultiThreadSingleton1 getInstance(){
        return instance;
    }
}

// 멀티스레드에서의 싱글톤2
class MultiThreadSingleton2{
    private static MultiThreadSingleton2 instance;

    private MultiThreadSingleton2(){ }

    public static synchronized MultiThreadSingleton2 getInstance(){
        // instance 가 없을 때만 생성
        if (instance == null)
            instance = new MultiThreadSingleton2();

        return instance;
    }
}

// 같은 instance 인지 Test
class Test{
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        MultiThreadSingleton1 multiThreadSingleton1 = MultiThreadSingleton1.getInstance();
        MultiThreadSingleton1 multiThreadSingleton2 = MultiThreadSingleton1.getInstance();
        MultiThreadSingleton2 multiThreadSingleton21 = MultiThreadSingleton2.getInstance();
        MultiThreadSingleton2 multiThreadSingleton22 = MultiThreadSingleton2.getInstance();

        System.out.println("singleton1 = " + singleton1);
        System.out.println("singleton2 = " + singleton2);
        System.out.println("multiThreadSingleton1 = " + multiThreadSingleton1);
        System.out.println("multiThreadSingleton2 = " + multiThreadSingleton2);
        System.out.println("multiThreadSingleton21 = " + multiThreadSingleton21);
        System.out.println("multiThreadSingleton22 = " + multiThreadSingleton22);
    }
}