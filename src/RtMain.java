/**
 *
 * Welcome to Knight Fight. A game that helps knights
 * of the round table fight enemies and maybe find the holy grail
 *
 * Students  do  not need to  edit this file.
 *
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class RtMain {


    /**
     * Program start point. Pass in debug  on the command line to have it trigger tests instead of the game
     */
    public static void main(String[] args) {
        if(args.length > 0 &&  args[0].equalsIgnoreCase("debug")) {
            RtTests tests = new RtTests();
            tests.runTests();
        }else {
            RtController gameControl = new RtController();
            gameControl.go();
        }
    }


}
