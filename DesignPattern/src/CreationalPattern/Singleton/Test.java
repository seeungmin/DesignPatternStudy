package CreationalPattern.Singleton;

// 같은 instance 인지 Test
public class Test{
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton1 singleton11 = Singleton1.getInstance();
        Singleton1 singleton12 = Singleton1.getInstance();
        Singleton2 singleton21 = Singleton2.getInstance();
        Singleton2 singleton22 = Singleton2.getInstance();
        Singleton3 singleton31 = Singleton3.getInstance();
        Singleton3 singleton32 = Singleton3.getInstance();

        System.out.println("singleton1 = " + singleton1);
        System.out.println("singleton2 = " + singleton2);
        System.out.println("singleton11 = " + singleton11);
        System.out.println("singleton12 = " + singleton12);
        System.out.println("singleton21 = " + singleton21);
        System.out.println("singleton22 = " + singleton22);
        System.out.println("singleton31 = " + singleton31);
        System.out.println("singleton32 = " + singleton32);
    }
}