/**
 * Represents a flower object in the game.
 */
public class Flower extends Item {
    /**
     * Constructs a Flower object with the specified coordinates.
     */
    public Flower(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate);
    }

    /**
     * Returns the name of the flower.
     */
    @Override
    public String getName() {
        return "Flower";
    }
}
