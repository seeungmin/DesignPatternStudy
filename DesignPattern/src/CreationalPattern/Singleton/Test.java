package CreationalPattern.Singleton;

// 같은 instance 인지 Test
public class Test{
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