public interface Treatable {

    static int convertDogToHumanYears(int dogAge) {
        double humanAge;
        humanAge = 16 * Math.log(dogAge) + 31;
        return (int) (Math.floor(humanAge));
    }

    static int convertCatToHumanYears(int catAge) {
        double humanAge;
        humanAge = 9 * Math.log(catAge) + 18;
        return (int) (Math.floor(humanAge));
    }

    /**
     * inherently public class that must be defined in classes that implement this
     * interface
     */
    void treat();
}