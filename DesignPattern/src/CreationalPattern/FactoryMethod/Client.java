package CreationalPattern.FactoryMethod;

public class Client {
    public static void main(String[] args) {
        BookFactory[] bookFactories = { new MajorBookFactory(), new GEBookFactory() };

        Book majorBook = bookFactories[0].explainBook();
        Book gEBook = bookFactories[1].explainBook();
    }
}
