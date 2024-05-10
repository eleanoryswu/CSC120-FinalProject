/**
 * Represents a twig item in the game.
 */
public class Twig extends Item {
    /**
     * Constructs a Twig object with the specified coordinates.
     */
    public Twig(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate);
    }

    /**
     * Returns the name of the twig.
     */
    @Override
    public String getName() {
        return "Twig";
    }
}
