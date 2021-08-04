//I worked on the homework assignment alone, using only course materials.
/**
 * dog class
 *
 * @author Rami Bouhafs
 */
public class Dog extends Pet implements Treatable {

    private String breed;

    /**
     * one param constructor
     *
     * @param breed is dogs breed
     */
    public Dog(String breed) {
        this("Buzz", 6, 3, breed);
    }

    /**
     * main constructor
     *
     * @param name      is title
     * @param age       is that
     * @param painLevel is that
     * @param breed     is that
     */
    public Dog(String name, int age, int painLevel, String breed) {
        super(name, age, painLevel);
        this.breed = breed;
    }

    /**
     * getter
     *
     * @return returns dog's breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * abstract playWith method
     *
     * @param p is the pet we're playing with
     */
    public void playWith(Pet p) {
        if (p instanceof Dog) {
            setPainLevel((getPainLevel() - 3));
            System.out.println("Woof! I love playing with other dogs so much that my pain level went from "
                    + (getPainLevel() - 3) + " to " + getPainLevel());
        } else if (p instanceof Cat) {
            Cat cat = (Cat) p;
            if (!(cat.getStripes())) {
                setPainLevel((getPainLevel() - 1));
                System.out.println("Woof. Cats without stripes are okay since they made my pain level go from "
                        + (getPainLevel() + 1) + " to " + getPainLevel());
            } else if (cat.getStripes()) {
                setPainLevel((getPainLevel() + 2));
                System.out.println("AHHH! I thought you were a tiger!");
            }
        } else if (p instanceof Narwhal) {
            return;
        }

    }

    /**
     * treat method, void
     */
    public void treat() {
        setPainLevel((getPainLevel() - 3));
    }

    /**
     * treat method, void
     */
    public void bark() {
        System.out.println("bark bark");
    }

    /**
     * overrides toString method
     * @return returns toString
     */
    public String toString() {
        return "My name is " + getName() + ", I am " + getAge() + ", and I am a " + getBreed()
                + ". On a scale of one to ten my pain level is " + getPainLevel() + ". My age in human years is "
                + Treatable.convertDogToHumanYears(getAge()) + ".";
    }

    /**
     * overrides equals method
     * @return returns boolean of whether theyre equal
     * @param o is the object we wanna compare
     */
    public boolean equals(Object o) {
        Dog dog = (Dog) o;
        return (super.equals((Object) o) && (breed.equals(dog.getBreed())));

    }

}
