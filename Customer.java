//I worked on the homework assignment alone, using only course materials.
/**
* vet class
*
* @author Rami Bouhafs
* @version 903591700
*/
public class Customer {

    private String name; // name of the customer
    private Location location; // location of the customer
    private Food[] orders; // represents an array of food that the customer has ordered
    private Restaurant current; // represents the current restaurant the customer is ordering from
    private double x;
    private double y;
/**
* prints pet's toString
*
* @param name is name
* @param x is x
* @param y is y
*/
    public Customer(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }
/**
* prints pet's toString
*
* @return is that
*/
    public String getName() {
        return this.name;
    }
/**
* prints pet's toString
*
* @return is that
*/
    public Location getLocation() {
        return this.location;
    }
/**
* prints pet's toString
*
* @param restaurant is that
* @param food is food
*/
    public void order(Restaurant restaurant, String food) {

    }

}