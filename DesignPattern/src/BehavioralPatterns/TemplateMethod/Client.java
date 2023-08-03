package BehavioralPatterns.TemplateMethod;

public class Client {
    public static void main(String[] args) {
        ProfessorJung pj = new ProfessorJung();
        ProfessorLee pl = new ProfessorLee();
        ProfessorPark pp = new ProfessorPark();

        pj.startClass();
        System.out.println("==========================================");
        pl.startClass();
        System.out.println("==========================================");
        pp.startClass();
        System.out.println("==========================================");
    }
}
