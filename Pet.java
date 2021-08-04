//I worked on the homework assignment alone, using only course materials.

/**
 * pet class
 *
 * @author Rami Bouhafs
 */
public abstract class Pet { // abstract keyword prevents instances from being created

    private String name;
    private int age;
    private int painLevel;

    /**
     * main constructor
     *
     * @param name      is name
     * @param age       is that
     * @param painLevel is that
     */
    public Pet(String name, int age, int painLevel) {
        this.name = name;
        if (age < 0) {
            this.age = 0;
        } else if (age > 100) {
            this.age = 100;
        } else {
            this.age = age;
        }
        if (painLevel < 0) {
            this.painLevel = 0;
        } else if (painLevel > 10) {
            this.painLevel = 10;
        } else {
            this.painLevel = painLevel;
        }
    }

    /**
     * getter for name
     *
     * @return is name
     */
    public String getName() {
        return name;
    }

    /**
     * getter for age
     *
     * @return is age
     */
    public int getAge() {
        return age;
    }

    /**
     * getter for painlevel
     *
     * @return is painlevel
     */
    public int getPainLevel() {
        return painLevel;
    }

    /**
     * setter for name
     *
     * @param newPainLevel is the new level we're setting it to
     */
    public void setPainLevel(int newPainLevel) {
        painLevel = newPainLevel;
    }

    /**
     * abstract method
     *
     * @param p is pet
     */
    public abstract void playWith(Pet p);

    /**
     * overrides toString method
     *
     * @return is toString
     */
    public String toString() {
        return "My name is " + name + ", and I am " + age + ". On a scale of one to ten my pain level is " + painLevel
                + ".";

    }

    /**
     * overrides equals method
     *
     * @param o is the object we're comparing
     * @return is whether they're equal, a boolean
     */
    public boolean equals(Object o) {
        if (!(o instanceof Pet)) { // makes sure object belongs to "Pet" class and also will return false if null
            return false;
        }
        Pet pet = (Pet) o;
        return ((pet.getAge() == getAge()) && (pet.getName().equals(getName()))
                && (pet.getPainLevel() == getPainLevel()));
    }

}
