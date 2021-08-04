//I worked on the homework assignment alone, using only course materials.
/**
* book class
*
* @author Rami Bouhafs
*/
public class Book extends LibraryItem {

    // vars

    private String backcoverBlurb;
    private int pages;

    // contructor
    // takes in the title, libraryCode, backcoverBlurb, and pages a
/**
* book constructor
*
* @param title is title
* @param libraryCode is that
* @param backcoverBlurb is that
* @param pages is that
*/
    public Book(String title, int libraryCode, String backcoverBlurb, int pages) {
        super(title, libraryCode);
        this.backcoverBlurb = backcoverBlurb;
        this.pages = pages;
    }

    // methods
    /**
* overrides summarize method
*
* @return is summary sentece
*/
    public String summarize() {
        return super.summarize() + " The book is " + pages + " pages long. " + backcoverBlurb + ".";
    }
}
