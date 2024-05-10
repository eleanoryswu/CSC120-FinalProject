/**
 * Represents a nest object in the game.
 */
public class Nest extends Item {
    /**
     * Constructs a Nest object with the specified coordinates.
     */
    public Nest(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate);
    }

    /**
     * Returns the name of the nest.
     */
    @Override
    public String getName() {
        return "Nest";
    }
}
