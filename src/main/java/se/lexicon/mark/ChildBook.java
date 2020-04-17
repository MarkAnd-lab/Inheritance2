package se.lexicon.mark;

/* Create two child classes ChildBook and Adultbook which inherit properties from Book.
Class ChildBook contains collection of childbooks and a method getChildBooks()which will represent all books which are categorized child.
 */

import java.util.Arrays;

public class ChildBook extends Book {
    private ChildBook[] childBooks = new ChildBook[0];
    /*private Book[] childBooks = {new ChildBook("Artur", "1200", "Child", "Att göra barn", 100),
            new ChildBook("Mark", "1794", "Child", "Skapa barn", 52),
            new ChildBook("Robin", "2000", "Child", "barn", 80) };
*/
    public ChildBook(String author, String year, String category, String title, int pages) {
        super(author, year, category, title, pages);

    }

    public void addBook(ChildBook book){
        this.childBooks = Arrays.copyOf(this.childBooks, this.childBooks.length +1);
        this.childBooks[this.childBooks.length -1] = book;
    }
    public void getChildBooks(){
        System.out.print("Child Books: ");
        for (int i = 0; i < this.childBooks.length; i++){
            System.out.println(this.childBooks[i].getTitle());
        }
    }



}
