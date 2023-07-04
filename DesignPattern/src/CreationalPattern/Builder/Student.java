package CreationalPattern.Builder;

public class Student{
    private String name;
    private int age;
    private String phone;
    private String email;

    public Student(String name, int age, String phone, String email) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public String toString(){
        return "name: " + name + ", " + "age: " + age + ", " + "phone: " + phone + ", " + "email: " + email;
    }
}
