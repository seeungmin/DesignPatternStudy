package CreationalPattern.FactoryMethod;

public interface BookFactory {
    default Book explainBook(){
        Book book = createBook();
        book.explain();
        return book;
    }

    Book createBook();
}

