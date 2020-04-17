package se.lexicon.mark;

/*Create a class Book with few properties (author, year, category, title etc.)
and private property pagesOfBook and method ReturnPages which will return number of pages.
Default constructor should create a book with 100 pages.  Add additional constructor with
which you can set how much pages books will have. Create two more classes ChildBook and AdultBook
which inherit properties from Book. Class ChildBook contains collections of child books and method ShowChildBook()
which will represent all books which are category child. Class AdultBook contains collections of adult, method
ShowAdult Book which will represent all books which are category adult and method SearchAdultBook which will ask
user which book wants to find typing the title, if that book exist in your collection return year, author, etc.,
otherwise for example ”Book does not exist!”*/

public class Book {
    //Fields
    private String author;
    private String year;
    private String category;
    private String title;
    private int pages;

    //All args Constructor

    public Book(String author, String year, String category, String title, int pages) {
        this.author = author;
        this.year = year;
        this.category = category;
        this.title = title;
        this.pages = pages;
    }
    //default constructor (no args Constructor)
    public Book() {
        this.pages = 100;
    }
    //Getters and Setters

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

}
