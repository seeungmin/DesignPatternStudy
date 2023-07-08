package CreationalPattern.AbstractFactory;

public class SWPersonFactory implements PersonFactory{
    @Override
    public Professor createProfessor() {
        return new SWProfessor();
    }

    @Override
    public Student createStudent() {
        return new SWStudent();
    }
}
