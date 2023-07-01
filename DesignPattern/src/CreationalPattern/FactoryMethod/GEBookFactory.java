package CreationalPattern.FactoryMethod;

public class GEBookFactory implements BookFactory{
    @Override
    public Book createBook() {
        return new GEBook();
    }
}
