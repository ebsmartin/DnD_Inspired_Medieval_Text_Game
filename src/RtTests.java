/**
 * Simple Tests that  run when you put debug in the command arguments.
 * It contains samples, but you can also modify it as much as you need.
 *
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class RtTests {
    
   
    //tests for the student to put together
    public void runTests() {
        // Testing get and set methods of Knight
        System.out.println("Testing Card Getters and Setters");
        RtKnight test = new RtKnight("Pendragon", 100, 100, 100);
        System.out.println(test.getCard());
        System.out.println(test.getName());
        System.out.println(test.getXp());
        test.setXp(test.getXp() + 5);
        test.setName("Morgana");
        test.setPower(30);
        test.setArmor(75);
        test.addDamage(99);
        System.out.println(test.getRemainingHealth());
        System.out.println(test.getCard());

        //STUDENT TODO - add  your own tests



        //Testing Tarot Cards
        System.out.println("Testing getting tarot cards");
        System.out.println(RtTarotDeck.getTarotCard(1, 10));
        System.out.println(RtTarotDeck.getTarotCard(2, 11));
        System.out.println(RtTarotDeck.getTarotCard(3, 4));
        System.out.println(RtTarotDeck.getTarotCard(4, 13));
        System.out.println(RtTarotDeck.getTarotCard(5, 7));
        System.out.println(RtTarotDeck.getTarotCard(5, 1));
        System.out.println(RtTarotDeck.getTarotCard(6, 30));

        //STUDENT TODO - add  your own tests

        RtView mainView = new RtView();
        // Dice Rolls
        System.out.println("Testing dice roll graphics");
        System.out.println(mainView.diceOne());
        mainView.displayRoll("Test 1", 1);
        mainView.displayRoll("Test 2", 2);
        mainView.displayRoll("Test 3", 3);
        mainView.displayRoll("Test 4", 4);
        mainView.displayRoll("Test 5", 5);
        mainView.displayRoll("Test 6", 6);

        //STUDENT TODO - add  your own tests
    }
}
