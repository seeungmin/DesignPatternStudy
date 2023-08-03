package BehavioralPatterns.TemplateMethod;

public class ProfessorLee extends Professor{
    @Override
    public void teach() {
        System.out.println("클라우드 컴퓨팅 수업을 합니다.");
    }
}
