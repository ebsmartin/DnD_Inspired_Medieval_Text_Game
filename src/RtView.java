import java.util.Scanner;

/**
 *
 * The RtView class handles all the output to the console for the
 * game. The reason why  it is in this class, is so that the output
 * can easily be changed to another
 * <a href="https://en.wikipedia.org/wiki/Mode_(user_interface)">mode</a>.
 *
 * @author YOUR NAME <br>
 *         YOUR EMAIL <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class RtView {
    // keeps the connection with the console
    private final Scanner scanner = new Scanner(System.in); //stored here, so you we are re-accessing System.in every  call


    /**
     * Splash screen for the game. Must contain the words Knight Fight and Round Table Games
     * Have fun!
     *
     * Example:
     * ======== WELCOME ======
     * =  Round Table Games  =
     * =     Introduces      =
     * =                     =
     * =     Knight Fight    =
     * = Quest for the Grail =
     * =                     =
     * =======================
     */
    public void splash() {
        //TODO Student
    }

    /**
     * Exit the game. Feel free to change, but leave the close() on the scanner
     */
    public void exitGame() {
        display("Thank thee for questing!\n"+
                "                       \n" +
                " ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ "   +  
        		                       "\n" +
                "=======================\n" + 
        		"=  Round Table Games  =\n" + 
        		"=         CSU         =\n" + 
        		"=                     =\n" + 
        		"=     Knight Fight    =\n" + 
        		"= Quest for the Grail =\n" + 
        		"= ~~~~~~~~~~~~~~~~~~~ =\n" + 
        		"  ===================  \n" +
        		"     ==============    \n" + 
        		"       =========       \n" + 
        		"         =====         \n" +
        		"          ===          \n" + 
        		"          ===          \n" +
        		"          ===          \n" + 
        		"          ===          \n" +
        		"         =====         \n" +
        		"       =========       \n" +
        		"     IIIIIIIIIIIII     \n");
        	
        
        scanner.close();// leave here
    }


    /**
     * Displays the dice in a graphical format based on the who is rolling, and the dice roll
     * @param name  name of the thing rolling dice
     * @param roll the value of the roll (1-6 only for now)
     */
    public void displayRoll(String name, int roll) {
    	display(name + " rolls: \n");
    	
    	if(roll == 1) {
        	display(diceOne());
        }	else if(roll == 2) {
        	display(diceTwo());
        }	else if(roll == 3) {
        	display(diceThree());
        }	else if(roll == 4) {
        	display(diceFour());
        }	else if(roll == 5) {
        	display(diceFive());
        }	else {
        	display(diceSix());
        }
        
    }


    /**
     * A string value representing a one on six sided dice
     * @return string graphical representation
     */
    public String diceOne() {
        return  "+---------+\n" +
                "|         |\n" +
                "|    *    |\n" +
                "|         |\n" +
                "+---------+\n";
    }

    /**
     * a string value representing a two on a six sided dice
     * @return string graphical representation
     */
    public String diceTwo() {
        return  "+---------+\n" +
                "|    *    |\n" +
                "|         |\n" +
                "|    *    |\n" +
                "+---------+\n";
    }

    /**
     * a string value representing a three on a six sided dice
     * @return string graphical representation
     */
    public String diceThree() {
        return  "+---------+\n" +
                "|    *    |\n" +
                "|    *    |\n" +
                "|    *    |\n" +
                "+---------+\n";
    }
    

    /**
     * a string value representing a four on a six sided dice   
     * @return string graphical representation
     */
    public String diceFour() {
        return "+---------+\n" +
        	   "|  *   *  |\n" +
        	   "|         |\n" +
        	   "|  *   *  |\n" +
        	   "+---------+\n"; 
    }

    /**
     * a string value representing a five on a six sided dice
     * @return string graphical representation
     */
    public String diceFive() {
    	return "+---------+\n" +
           	   "|  *   *  |\n" +
           	   "|    *    |\n" +
           	   "|  *   *  |\n" +
           	   "+---------+\n"; 
       }
    

    /**
     * a string value representing a six on a six sided dice
     * @return string graphical representation
     */
    public String diceSix() {
        return "+---------+\n" +
               "|  *   *  |\n" +
               "|  *   *  |\n" +
               "|  *   *  |\n" +
               "+---------+\n"; 
    }

    //  ----- do not edit below this line ----------

    /**
     * Simple prints to the screen. but used as a method in case the mode changes
     * @param str value to print to the screen (no new lin)
     */
    public void display(String str) {
        System.out.print(str);
    }

    /**
     * The main menu
     * @return string value of the main menu
     */
    public static String mainMenuOptions() {
        return  "========= Command Options =========\n" +
                "= 1. (L)ist Knights               =\n" +
                "= 2. (F)ight Monsters             =\n" +
                "= 3. Get (T)arot Card             =\n" +
                "= 4. E(x)it Game                  =\n" +
                "===================================\n" +
                "Enter command name (list), letter or  number";
    }

    /**
     * Prints out a question and gets the client input
     * @param question the question to print
     * @return the value lowerCase of the clients answer
     */
    public String getAction(String question) {
        display(question);
        String x = scanner.nextLine();
        System.out.println();
        return x.toLowerCase(); // to force case to be the same
    }

    /**
     * displays the main menu
     */
    public void displayMainMenu() {
        display(mainMenuOptions() + "\n");
    }


}
