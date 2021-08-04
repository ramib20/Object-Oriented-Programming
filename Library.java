//I worked on the homework assignment alone, using only course materials.
import java.util.Arrays;
/**
* library class that has object array and methods
*
* @author Rami Bouhafs
* @version 903591700
*/
public class Library {

    // vars

    private LibraryItem[] bookshelf; // holds objects of type LibraryItem

   /**
   * zero parameter constructor
   */
    public Library() {
        LibraryItem[] bookshelf;
    }

   /**
   * one parameter constructor that takes in object array
   * @param bookshelf the object array
   */
    public Library(LibraryItem[] bookshelf) {
        Arrays.sort(bookshelf);
        this.bookshelf = bookshelf;
    }

    // methods
   /**
   * loops through all library items in bookshelf and prints their code and summary
   */
    public void browseLibraryItems() {
        for (LibraryItem b : bookshelf) {
            System.out.println(b.getLibraryCode() + ": " + b.summarize());
        }
    }
   /**
   * copies bookshelf array to new array one longer and adds newItem
   * @param newItem is the new item
   */
    public void addLibraryItem(LibraryItem newItem) {

        LibraryItem[] updatedBookshelf = new LibraryItem[(bookshelf.length + 1)];

        for (int i = 0; i <= bookshelf.length - 1; i++) {
            updatedBookshelf[i] = bookshelf[i];
        }
        updatedBookshelf[(bookshelf.length)] = newItem;
        Arrays.sort(updatedBookshelf);
        bookshelf = updatedBookshelf;
    }
   /**
   * loops thru array to find libraryitem with code
   * @param code is the code
   * @return is what it returns
   */
    public LibraryItem getLibraryItem(int code) {
        for (LibraryItem b : bookshelf) {
            if (b.getLibraryCode() == code) {
                return b;
            }
        }
        return null;
    }
   /**
   * just finds how many library items are in bookshelf array
   * @return is what it returns
   */
    public int getNumberOfItems() {
        int bookshelfCount = 0;
        for (LibraryItem b : bookshelf) {
            bookshelfCount++;
        }
        return bookshelfCount;
    }

}