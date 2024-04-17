package Strategy;

import java.util.List;

public class BookServiceImpl<Book> implements Service<Book>{
    @Override
    public Book create(Book newBook) {
        System.out.println("Create book");
        return newBook;
    }

    @Override
    public Book update(Book book) {
        System.out.println("Update book");
        return book;
    }

    @Override
    public List<Book> listAll() {
        System.out.println("List all books");
        return null;
    }

    @Override
    public String delete(Book book) {
        System.out.println("Delete book");
        return "the book has been deleted";
    }
}
