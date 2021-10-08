import java.util.Random;

/**
 * Handles rolling dice in the game, using the build in Java Random class
 *
 * Students do not need to edit this  file
 *
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *          Colorado State University
 * @version 202010
 */
public class RtDiceRoller {
    private int sides = 6; // assumes a six sided dice for default
    private final Random rnd = new Random();

    /**
     * Returns the number of sides for the dice
     * @return number of sides
     */
    public int getSides() {
        return sides;
    }

    /**
     * Sets the number of sides for the dice.
     * @param sides the sides set for the dice.
     */
    public void setSides(int sides) {
        this.sides = sides;
    }

    /**
     * Randomly  generates a number based on the number of  sides
     * @return a range between 1-sides
     */
    public int roll() {
        return rnd.nextInt(getSides()) + 1; // need to add one, as .nextInt() is 0->sides exclusive
    }

    /**
     * Basic dice, assumes a d6
     */
    RtDiceRoller() {}

    /**
     * Allows for other dice type, such as a d20
     * @param sides number of sides to set
     */
    RtDiceRoller(int sides) {
        setSides(sides);
    }
}
