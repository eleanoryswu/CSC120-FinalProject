/**
 * Represents an item in the game.
 */
public class Item {
    private int xCoordinate;
    private int yCoordinate;

    /**
     * Constructs an Item object with the specified coordinates.
     */
    public Item(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    /**
     * Returns the x-coordinate of the item.
     */
    public int getXCoordinate() {
        return xCoordinate;
    }

    /**
     * Returns the y-coordinate of the item.
     */
    public int getYCoordinate() {
        return yCoordinate;
    }

    /**
     * Returns the name of the item.
     */
    public String getName() {
        return "Item";
    }
}
