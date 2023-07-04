package CreationalPattern.Builder;

public class DefaultStudentBuilder implements StudentBuilder{
    private String name;
    private int age;
    private String phone;
    private String email;

    @Override
    public StudentBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public StudentBuilder age(int age) {
        this.age = age;
        return this;
    }

    @Override
    public StudentBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public StudentBuilder email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public Student build() {
        return new Student(name, age, phone, email);
    }
}
