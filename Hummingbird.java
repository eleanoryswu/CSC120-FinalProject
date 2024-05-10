import java.util.ArrayList;

/**
 * Represents a hummingbird in the game.
 * @author: Eleanor wu
 */
public class Hummingbird {
    private int xCoordinate;
    private int yCoordinate;
    private int energy;
    private ArrayList<Item> inventory;
    private String lastMethod;

    /**
     * Constructs a Hummingbird object with default coordinates (0, 0) and energy level 100.
     */
    public Hummingbird() {
        this.xCoordinate = 0;
        this.yCoordinate = 0;
        this.energy = 100;
        this.inventory = new ArrayList<>();
        this.lastMethod = "";
    }

    // Getters and setters

    /**
     * Returns the x-coordinate of the hummingbird.
     */
    public int getXCoordinate() {
        return xCoordinate;
    }

    /**
     * Sets the x-coordinate of the hummingbird.
     */
    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    /**
     * Returns the y-coordinate of the hummingbird.
     */
    public int getYCoordinate() {
        return yCoordinate;
    }

    /**
     * Sets the y-coordinate of the hummingbird.
     */
    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    /**
     * Returns the inventory of the hummingbird.
     */
    public ArrayList<Item> getInventory() {
        return inventory;
    }

    /**
     * Returns the last method called by the hummingbird.
     */
    public String getLastMethod() {
        return lastMethod;
    }

    /**
     * Sets the last method called by the hummingbird.
     */
    public void setLastMethod(String lastMethod) {
        this.lastMethod = lastMethod;
    }

    // Game actions

    /**
     * Adds an item to the inventory.
     */
    public void grab(Item item) {
        inventory.add(item);
        System.out.println("You picked up the " + item.getName() + ".");
    }

    /**
     * Moves the hummingbird in the specified direction.
     */
    public void walk(String direction) {
        switch (direction) {
            case "north":
                yCoordinate++;
                System.out.println("Moved north.");
                break;
            case "south":
                yCoordinate--;
                System.out.println("Moved south.");
                break;
            case "east":
                xCoordinate++;
                System.out.println("Moved east.");
                break;
            case "west":
                xCoordinate--;
                System.out.println("Moved west.");
                break;
            default:
                System.out.println("Invalid direction.");
        }
    }

    /**
     * Uses an item in the inventory.
     */
    public void use(Item item) {
        if (item instanceof Twig) {
            System.out.println("You used the twig to break through the spiderweb.");
        } else {
            System.out.println("You cannot use this item.");
        }
    }

    /**
     * Lays eggs at the nest if the hummingbird is at the nest.
     */
    public void layEggs() {
        System.out.println("You laid your eggs in the nest. Congratulations!");
    }

    /**
     * Checks if the hummingbird has won the game.
     */
    public boolean hasWon(Nest nest) {
        return inventory.contains(new Twig()) && xCoordinate == nest.getXCoordinate() && yCoordinate == nest.getYCoordinate();
    }

    /**
     * Prints the inventory of the hummingbird.
     */
    public void printInventory() {
        System.out.println("Inventory:");
        for (Item item : inventory) {
            System.out.println("- " + item.getName());
        }
    }
}
