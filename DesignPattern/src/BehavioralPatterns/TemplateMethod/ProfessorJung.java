package BehavioralPatterns.TemplateMethod;

public class ProfessorJung extends Professor{
    @Override
    public void teach() {
        System.out.println("컴퓨터 네트워크 수업을 합니다.");
    }
}
