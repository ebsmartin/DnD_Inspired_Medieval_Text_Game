/**
 *
 * Basic controller for the game. Everything passes through this class to get anything
 * accomplished in the game.
 *
 * Students do not need to edit this file.
 *
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class RtController {
    // it is common to put fixed strings at the top  of a file, and access them as variables.
    final String QUESTION_START = "\nWhat would you like to do? ";
    final String QUESTION_SET_ACTIVE = "Would you like to set this knight as active (y/n)? ";
    final String QUESTION_VIEW_MORE_KNIGHTS = "Would you like to view more knights (y/n)? ";

    // these are the different objects the control needs to work
    RtView mainView = new RtView();
    RtBarrack barracks =  new RtBarrack();
    RtCombatEngine combatEngine = new RtCombatEngine(mainView);

    //two type of dice!
    RtDiceRoller d6 = new RtDiceRoller();
    RtDiceRoller d30 = new RtDiceRoller(30);


    /**
     * Process commands based on the main menu. Following the standard of old
     * text based console games, we allow both numbers and words to trigger the command
     * @param response the command the client is trying to trigger from input
     * @return true if the game should continue, false if it should end
     */
    public boolean processCommand(String response) {
        boolean rtn = true;
        if(response.contains("x"))  {
            rtn = false;
        }else if(response.contains("4")) {
            rtn =  false;
        }else if(response.contains("?")) {
            mainView.displayMainMenu();
        }else if(response.contains("h")) {
            mainView.displayMainMenu();
        }else if(response.contains("help")) {
            mainView.displayMainMenu();
        }else if(response.contains("l")) { // you will learn a more concise way to do this in the future
            knightAction();
        }else if(response.contains("ls")) {
            knightAction();
        }else if(response.contains("1")) {
            knightAction();
        }else if(response.contains("f")) {
           combatEngine.battle(barracks.getActive(), RtMonster.generateRandomMonster());
        }else if(response.contains("2")) {
            combatEngine.battle(barracks.getActive(), RtMonster.generateRandomMonster());
        }else if(response.contains("t")) {
            mainView.display(RtTarotDeck.getTarotCard(d6.roll(), d30.roll()));
        }else if(response.contains("3")) {
            mainView.display(RtTarotDeck.getTarotCard(d6.roll(), d30.roll()));
        }else {
            mainView.displayMainMenu();
        }
        return rtn;
    }

    // do not edit below this line

    /**
     * Handles actions with listing the knights, and setting
     * which knight is active.
     */
    void knightAction() {
        String cmd = mainView.getAction(barracks.knightList());
        if(!cmd.isEmpty() && Character.isDigit(cmd.charAt(0))) {
            int selected = Integer.parseInt(cmd);
            mainView.display(barracks.getKnightCard(selected));
            cmd = mainView.getAction(QUESTION_SET_ACTIVE);
            if(cmd.contains("y")) barracks.setActive(selected);
            cmd = mainView.getAction(QUESTION_VIEW_MORE_KNIGHTS);
            if(cmd.contains("n")) return; // return out of the loop created below
        }
        knightAction(); // repeat the menu sequence
    }

    /**
     * Main driver for the progam. As long as processCommand continues to return true
     * and once it returns false, it ends the program
     */
    public void go() {
        mainView.splash();
        String response;
        boolean cont = true;
        while(cont) {
            response = mainView.getAction(QUESTION_START);
            cont = processCommand(response);
        } //Type of loop that causes game to run until the user types exit or x
        mainView.exitGame();
    }
}
