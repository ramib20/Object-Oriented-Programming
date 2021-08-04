
//I worked on the homework assignment alone, using only course materials.
/**
* libraryitem class
*
* @author Rami Bouhafs
*/
public abstract class LibraryItem implements Summarizable, Comparable<LibraryItem> {

    //variables
    private String title;
    private int libraryCode;


    //constructor
    /**
* constructor
* @param title is title
* @param libraryCode is just that
*/
    public LibraryItem(String title, int libraryCode) {        //now you can't create instances of this class outside

        this.title = title;
        this.libraryCode = libraryCode;
    }

    //getters
    /**
* just a getter for title
* @return title
*/
    public String getTitle() {
        return title;
    }
/**
* just a getter for lbirarycode
* @return lbirarycode
*/
    public int getLibraryCode() {
        return libraryCode;
    }
    //methods
/**
* overries summarize method
* @return sentence
*/
    public String summarize() {
        return "This item is called " + title + ".";
    }

    @Override //A LibraryItem is greater than another LibraryItem if its libraryCode is less than the other one’s
    public int compareTo(LibraryItem o) {
        return (libraryCode - ((LibraryItem) o).libraryCode); //Positive int if calling object is greater

    }
}
