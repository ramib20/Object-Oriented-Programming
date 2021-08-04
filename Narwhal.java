//I worked on the homework assignment alone, using only course materials.

/**
 * narwhal class
 *
 * @author Rami Bouhafs
 */
public class Narwhal extends Pet {

    private int hornLength;

    /**
     * no param constructor with default values
     */
    public Narwhal() {
        this("Jelly", 19, 2, 7);
    }

    /**
     * onstructor 4 params
     *
     * @param name       is name
     * @param age        is that
     * @param painLevel  is level of pain of pet
     * @param hornLength is length of narwhal's horn
     */
    public Narwhal(String name, int age, int painLevel, int hornLength) {
        super(name, age, painLevel);
        this.hornLength = hornLength;
    }

    /**
     * getter
     *
     * @return returns hornLength
     */
    public int getHornLength() {
        return hornLength;
    }

    /**
     * book constructor
     *
     * @param p is the pet we are calling to play with
     */
    public void playWith(Pet p) {
        if (p instanceof Narwhal) {
            setPainLevel((getPainLevel() - 2));
            System.out.println("Who needs dogs and cats when we have each other");
        } else {
            setPainLevel((getPainLevel() + 1));
            System.out.println("I live in the ocean so I can’t play with you");
        }
    }

    /**
     * book constructor
     *
     * @return returns toString for narwhal
     */
    public String toString() {
        return super.toString() + " I have a horn that is " + hornLength + " feet long";
    }

    /**
     * book constructor
     * @return returns true if they're equal, false if not
     * @param o is the object we are checking to see if equals our narwhal
     */
    public boolean equals(Object o) {
        Narwhal narwhal = (Narwhal) o;
        return (super.equals((Object) o) && (hornLength == (narwhal.getHornLength())));

    }
}
