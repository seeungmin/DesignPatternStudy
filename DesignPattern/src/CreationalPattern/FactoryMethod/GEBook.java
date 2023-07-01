package CreationalPattern.FactoryMethod;

public class GEBook implements Book{
    @Override
    public void explain() {
        System.out.println("교양 책입니다.");
    }
}
