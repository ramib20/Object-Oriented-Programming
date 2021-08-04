//I worked on the homework assignment alone, using only course materials.
/**
* magazine class
*
* @author Rami Bouhafs
* @version 903591700
*/
public class Magazine extends LibraryItem {

    //vars

    private String coverDescription;

    //constructor
/**
* constructor
* @param title is tite
* @param libraryCode is that
* @param coverDescription is that
*/
    public Magazine(String title, int libraryCode, String coverDescription) {
        super(title, libraryCode);
        this.coverDescription = coverDescription;
    }

    //methods
/**
* overrides sumarize method
* @return summary sentence
*/
    public String summarize() {
        return super.summarize() + " The cover looks like " + coverDescription + ".";
    }

}