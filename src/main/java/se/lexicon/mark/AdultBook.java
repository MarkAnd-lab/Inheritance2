package se.lexicon.mark;

//Class Teenage Book contains collection of books for Teenagers.
// Create a method getTeenageBooks() which will represent all books which are categorized for teenagers.
/*
Create a method with the following parameters inside TeenageBook.class
Search TeenageBook(String title) which will ask user which book you want to find typing
the title. If that book exist in your collection it returns all values year,author, etc.Otherwise
if not found return ”Book does not exist!”
 */

import java.util.Arrays;

public class AdultBook extends Book {
    private AdultBook[] adultBooks = new AdultBook[0];

    public AdultBook(String author, String year, String category, String title, int pages) {
        super(author, year, category, title, pages);
    }
    //Searching for a adult book title
    public Book SearchAdultBook(String title) {
        System.out.println("Search for a book title ");
        for (int i = 0; i < this.adultBooks.length; i++) {
            if (this.adultBooks[i].getTitle().equalsIgnoreCase(title)) {
            return adultBooks[i];
            }
        }
        return null;
    }
    public void addBook (AdultBook book){
        this.adultBooks = Arrays.copyOf(this.adultBooks, this.adultBooks.length + 1);
        this.adultBooks[this.adultBooks.length - 1] = book;
    }
    public void getAdultBooks() {
        System.out.print("Adult books: ");
        for (int i = 0; i < this.adultBooks.length; i++) {
            System.out.println(this.adultBooks[i].getTitle());
        }


    }
}
