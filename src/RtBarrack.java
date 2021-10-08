/**
 * The Barracks hold multiple knights, and through the RtController, the
 * active knight can be changed. The active knight is the one who is currently
 * fighting monsters.
 * 
 * Students do not need to modify this file
 *
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class RtBarrack {
    // Three knights for the current game. In the future,  you will learn a better way to do this.
    RtKnight galahad = new RtKnight("Sir Galahad", 100, 50, 35);
    RtKnight lancelot = new RtKnight("Lancelot du Lac", 100, 75, 25);
    RtKnight bedivere = new RtKnight("Bedwyr Bedrydant", 75, 100, 15);

    // just the number  of the active knight
    int active = 1; // set the active knight

    /**
     * Sets the active variable. Should be a value between 1 and 3 (or however many knights there are)
     * @param selected  index of the selected knight
     */
    public void setActive(int selected) {
        active = selected;
    }


    /**
     * Gets the active knight as an object. Really, the setActive could be this also.
     * @return the knight who is currently active.
     */
    public RtKnight getActive() {
        if(active == 1) return bedivere;
        if(active == 2) return lancelot;
        return galahad;
    }

    /**
     * Prints a list of knights, just their name  and if they are active or not.
     * @return String that is a list of all the knights. Assumes printing as a menu.
     */
    public String knightList() {
        return String.format("1. %s%n", bedivere.getName() + (active == 1 ? " (active)":"")) +
               String.format("2. %s%n",  lancelot.getName()  + (active == 2 ? " (active)":"")) +
               String.format("3. %s%n", galahad.getName() + (active == 3 ? " (active)":"")) +
               "Select knight to view stats card, and set as primary knight > ";
    }

    /**
     * Gets the knight card for the requested knight
     * @param knightId the index of the knight (between 1-3), so we know which card method to call
     * @return the value from the getCard() method pending the nested required knight
     */
    public String getKnightCard(int knightId) {
       if(knightId == 1) {
           return bedivere.getCard();
       }else if(knightId == 2) {
           return lancelot.getCard();
       } else if(knightId == 3) {
           return galahad.getCard();
       }
       return "Invalid Card";
    }


}
