package Strategy;

import Strategy.Objects.Book;
import Strategy.Objects.Mug;

public class Main {

    public static void main(String[] args) {

        Controller strategy = new Controller();
        strategy.setService(new BookServiceImpl<Book>());
        Book book = (Book) strategy.getService().create(new Book("The yellow heart", "Pablo Neruda"));
        strategy.setService(new MugServiceImpl<Mug>());
        Mug mug = (Mug) strategy.getService().create(new Mug("Hollow Knight"));
        System.out.println(book.getAuthor() + " - " + book.getTitle());
        System.out.println(mug.getTheme());

        //without the Controller class

        Service<Book> bookService =  new BookServiceImpl<Book>();
        Service<Mug> mugService =  new MugServiceImpl<Mug>();
        var book2 = bookService.create(new Book("The Da Vinci code", "Dan Brown"));
        var mug2 = mugService.create(new Mug("Lollipop"));
        System.out.println(book2.getAuthor() + " - " + book2.getTitle());
        System.out.println(mug2.getTheme());
    }

}
