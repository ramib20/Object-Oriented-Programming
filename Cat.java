//I worked on the homework assignment alone, using only course materials.

/**
 * cat class
 *
 * @author Rami Bouhafs
 * @version 903591700
 */
public class Cat extends Pet implements Treatable {

    private boolean hasStripes;

    /**
     * one param constructor
     *
     * @param hasStripes is whether cat has stripes or not, boolean
     */
    public Cat(boolean hasStripes) {
        this("Purrfect", 4, 9, hasStripes);
    }

    /**
     * main constructor/**
     *
     * @param name       is name
     * @param age        is that
     * @param painLevel  is that
     * @param hasStripes is that
     */
    public Cat(String name, int age, int painLevel, boolean hasStripes) {
        super(name, age, painLevel);
        this.hasStripes = hasStripes;
    }

    /**
     * getter for stripes
     *
     * @return returns boolean of whether cat has stripes
     */
    public boolean getStripes() {
        return hasStripes;
    }

    /**
     * method for playing with another pet
     *
     * @param p is the pet we're calling to play with
     */
    public void playWith(Pet p) {
        if (p instanceof Dog) {
            setPainLevel((getPainLevel() + 1));
            System.out.println("Meow. Go away " + p.getName() + "! I don’t like playing with Dogs!");
        } else if (p instanceof Cat) {
            Cat cat = (Cat) p;
            if (getStripes() == cat.getStripes()) {
                setPainLevel((getPainLevel() - 4));
                System.out.println("Meow! I love playing with other cats with the same pattern as me");
            }

            if (getStripes() != cat.getStripes()) {
                setPainLevel((getPainLevel() - 2));
                System.out.println("Meow! I like playing with other cats without the same pattern as me");
            }
        } else if (p instanceof Narwhal) {
            return;
        }

    }

    /**
     * void method from interface
     */
    public void treat() {
        setPainLevel((getPainLevel() - 1));
    }

    /**
     * overrides toString method
     *
     * @return returns toString for cat
     */
    public String toString() {
        return super.toString() + " My age in human years is " + Treatable.convertCatToHumanYears(getAge()) + ".";
    }

    /**
     * overrides equals method
     * @param o is object we're comparing
     * @return returns whether two cats are equal
     */
    public boolean equals(Object o) {
        Cat cat = (Cat) o;
        return (super.equals((Object) o) && (hasStripes == (cat.getStripes())));

    }

}