package CreationalPattern.Builder;

public interface StudentBuilder {
    public StudentBuilder name(String name);
    public StudentBuilder age(int age);
    public StudentBuilder phone(String phone);
    public StudentBuilder email(String email);

    public Student build();

}
