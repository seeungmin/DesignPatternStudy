package CreationalPattern.AbstractFactory;

public class CEPersonFactory implements PersonFactory{
    @Override
    public Professor createProfessor() {
        return new CEProfessor();
    }

    @Override
    public Student createStudent() {
        return new CEStudent();
    }
}
