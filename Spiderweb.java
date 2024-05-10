/**
 * Represents a spiderweb obstacle in the game.
 */
public class SpiderWeb extends Item {
    /**
     * Constructs a SpiderWeb object with the specified coordinates.
     */
    public SpiderWeb(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate);
    }

    /**
     * Returns the name of the spiderweb.
     */
    @Override
    public String getName() {
        return "SpiderWeb";
    }
}
