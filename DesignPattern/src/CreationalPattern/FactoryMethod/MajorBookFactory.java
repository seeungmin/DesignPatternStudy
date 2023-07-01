package CreationalPattern.FactoryMethod;

public class MajorBookFactory implements BookFactory{
    @Override
    public Book createBook() {
        return new MajorBook();
    }
}
