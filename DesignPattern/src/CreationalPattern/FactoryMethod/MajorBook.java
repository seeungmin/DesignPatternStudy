package CreationalPattern.FactoryMethod;

public class MajorBook implements Book{
    @Override
    public void explain() {
        System.out.println("전공 책입니다.");
    }
}
