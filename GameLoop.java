import java.util.Scanner;

/**
 * Combines and runs all the components of the game.
 */
public class GameLoop {
    private Hummingbird hummingbird = new Hummingbird();
    private Twig twig = new Twig(2, 3);
    private SpiderWeb spiderWeb = new SpiderWeb(4, 2);
    private Waterfall waterfall = new Waterfall(0, 1);
    private Nest nest = new Nest(3, 4);
    private boolean endOfGame = false;
    private boolean wordFound = false;

    /**
     * Checks if the user input contains "grab" and executes the proper methods as a result.
     */
    public void containsGrab(String dialogue) {
        if (dialogue.contains("grab")) {
            wordFound = true;
            hummingbird.setLastMethod("");
            if (dialogue.contains("twig")) {
                if (!hummingbird.getInventory().contains(twig)) {
                    hummingbird.grab(twig);
                } else {
                    System.out.println("You already have the twig.");
                }
            } else {
                System.out.println("You cannot grab that.");
            }
        }
    }

    /**
     * Checks if the user input contains "walk" and executes the proper methods as a result.
     */
    public void containsWalk(String dialogue) {
        if (dialogue.contains("walk")) {
            wordFound = true;
            String[] parts = dialogue.split("\\s+");
            if (parts.length > 1) {
                String direction = parts[1];
                if (direction.equals("north") || direction.equals("south") || direction.equals("east") || direction.equals("west")) {
                    hummingbird.walk(direction);
                } else {
                    System.out.println("Invalid direction. Use 'north', 'south', 'east', or 'west'.");
                }
            } else {
                System.out.println("Please specify a direction.");
            }
        }
    }

    /**
     * Checks if the user input contains "use" and updates the appropriate attributes as a result.
     */
    public void containsUse(String dialogue) {
        if (dialogue.contains("use")) {
            wordFound = true;
            String[] parts = dialogue.split("\\s+");
            if (parts.length > 1) {
                String item = parts[1];
                if (item.equals("twig")) {
                    if (hummingbird.getXCoordinate() == spiderWeb.getXCoordinate() && hummingbird.getYCoordinate() == spiderWeb.getYCoordinate()) {
                        hummingbird.use(twig);
                    } else {
                        System.out.println("You cannot use the twig here.");
                    }
                } else {
                    System.out.println("You cannot use that item.");
                }
            } else {
                System.out.println("Please specify an item to use.");
            }
        }
    }

    /**
     * Checks if the user input contains "lay eggs" and updates the appropriate attributes as a result.
     */
    public void containsLayEggs(String dialogue) {
        if (dialogue.contains("lay eggs")) {
            wordFound = true;
            if (hummingbird.getXCoordinate() == nest.getXCoordinate() && hummingbird.getYCoordinate() == nest.getYCoordinate()) {
                hummingbird.layEggs();
            } else {
                System.out.println("You can only lay eggs at the nest.");
            }
        }
    }

    /**
     * Main method to run the game loop.
     */
    public static void main(String[] args) {
        GameLoop g = new GameLoop();

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Hummingbird Adventure Game!");
        System.out.println("Your goal is to navigate the map, find a twig, locate the nest, and lay eggs.");
        System.out.println("Be cautious of obstacles and manage your energy wisely.");
        System.out.println("Type 'help' at any point for a list of commands.");

        while (!g.endOfGame) {
            String dialogue = input.nextLine().toLowerCase();

            g.containsGrab(dialogue);
            g.containsWalk(dialogue);
            g.containsUse(dialogue);
            g.containsLayEggs(dialogue);

            if (dialogue.contains("print inventory")) {
                g.wordFound = true;
                g.hummingbird.printInventory();
            }

            if (dialogue.contains("help")) {
                g.wordFound = true;
                System.out.println("The following are a list of available commands:");
                System.out.println("- grab twig");
                System.out.println("- walk <direction>");
                System.out.println("- use twig");
                System.out.println("- lay eggs");
                System.out.println("- print inventory");
            }

            if (!g.wordFound) {
                System.out.println("I don't understand that command. Type 'help' for a list of commands.");
            }

            if (g.hummingbird.hasWon(g.nest)) {
                g.endOfGame = true;
            }
            g.wordFound = false;
        }

        System.out.println("Congratulations! You have successfully laid your eggs and won the game!");
        System.out.println("****THE END****");
        input.close();
    }
}
