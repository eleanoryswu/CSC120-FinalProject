/**
 * Represents a waterfall obstacle in the game.
 */
public class Waterfall extends Item {
    /**
     * Constructs a Waterfall object with the specified coordinates.
     */
    public Waterfall(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate);
    }

    /**
     * Returns the name of the waterfall.
     */
    @Override
    public String getName() {
        return "Waterfall";
    }
}
