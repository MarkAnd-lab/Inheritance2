package se.lexicon.mark;

/**
 * Hello world!
 *
 */test
public class App 
{
    public static void main( String[] args )
    {
        Book book = new Book();
        ChildBook childBook = new ChildBook("Artur", "1200", "Child", "Att göra barn", 100);
        childBook.addBook(childBook);
        childBook.addBook(new ChildBook("Mark", "1794", "Child", "Skapa barn", 52));
        childBook.getChildBooks();
        AdultBook adultBook = new AdultBook("Mark", "1194", "Adult", "Woman", 200);
        adultBook.addBook(adultBook);

        Book found =  adultBook.SearchAdultBook("woman");
        System.out.println(found.getTitle());
        System.out.println(found.getAuthor());
        System.out.println(found.getCategory());
        System.out.println(found.getYear());
        System.out.println( "\nPages " + book.getPages());
    }
}
