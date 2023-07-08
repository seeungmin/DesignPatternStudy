package CreationalPattern.AbstractFactory;

public class Client {

    public static void main(String[] args) {
        create(new CEPersonFactory());
        create(new SWPersonFactory());
    }

    private static void create(PersonFactory personFactory){
        Professor professor = personFactory.createProfessor();
        Student student = personFactory.createStudent();

        professor.explain();
        student.explain();
    }
}
