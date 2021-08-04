//I worked on the homework assignment alone, using only course materials.
/**
* vet class
*
* @author Rami Bouhafs
* @version 903591700
*/
public class Food {

    private String name;
    private int quantity;
    private double price;

/**
* prints pet's toString
*
* @param name is x
* @param quantity is y
* @param price is y

*/
    public Food(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
/**
* prints pet's toString
*
* @return is strujmgn
*/
    public String toString() {
        return name + " costs $" + price + ", and there are " + quantity + " remaining.";
    }

}
