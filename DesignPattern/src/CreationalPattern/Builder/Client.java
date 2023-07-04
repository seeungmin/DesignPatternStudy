package CreationalPattern.Builder;

public class Client {
    public static void main(String[] args) {
        Student student = new DefaultStudentBuilder()
                .name("신짱구")
                .age(5)
                .phone("000-0000-0000")
                .email("sinzzang@...")
                .build();

        System.out.println("student = " + student.toString());
    }
}
