//I worked on the homework assignment alone, using only course materials.
/**
* vet class
*
* @author Rami Bouhafs
* @version 903591700
*/
public class Vet {
/**
* prints pet's toString
*
* @param pet is pet
*/
    public static void inspectPet(Pet pet) {
        System.out.println(pet);
        if (pet instanceof Dog) {
            Dog dog = (Dog) pet;
            dog.bark();
        }
    }
/**
*  reduces dogs pain level
* @param dog is dog
*/
    public static void giveDogTreat(Dog dog) {
        dog.setPainLevel((dog.getPainLevel() - 2));
    }
/**
* decides whether pet is treatable and how to follow
*
* @param pet is pet
*/
    public static void treatPet(Pet pet) {

        if (pet instanceof Dog) {
            Dog dog = (Dog) pet;
            System.out.println("Welcome to the vet" + pet.getName());
            dog.treat();
            System.out.println("Wow what a cute dog!");
            giveDogTreat(dog);
        } else if (pet instanceof Cat) {
            Cat cat = (Cat) pet;
            System.out.println("Welcome to the vet" + pet.getName());
            cat.treat();
        } else if (pet instanceof Narwhal) {
            System.out.println("Sorry, we cannot treat " + pet.getName());
        }
    }

}