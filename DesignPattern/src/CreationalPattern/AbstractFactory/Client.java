package CreationalPattern.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        Professor professor1 = new CEPersonFactory().createProfessor();
        Professor professor2 = new SWPersonFactory().createProfessor();

        professor1.explain();
        professor2.explain();

        Student student1 = new CEPersonFactory().createStudent();
        Student student2 = new SWPersonFactory().createStudent();

        student1.explain();
        student2.explain();
    }
}
