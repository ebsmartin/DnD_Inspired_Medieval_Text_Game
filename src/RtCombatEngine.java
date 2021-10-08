/**
 * The Combat Engine handles combat between a Knight and Monster
 *
 * Students do NOT need to edit this class.
 *
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class RtCombatEngine {
    RtView view;
    RtDiceRoller d6  = new RtDiceRoller();

    /**
     * Takes a knight and monster and pairs then against each other until one comes out on top.
     * @param knight the knight who is fighting
     * @param monster the monster who is fighting
     */
    public void battle(RtKnight knight, RtMonster monster) {
        displayBattle(knight.getCard(), monster.getCard());

        while(knight.getRemainingHealth() > 0 && monster.getRemainingHealth() > 0) {
            int knightRoll = d6.roll();
            int monsterRoll = d6.roll();
            view.displayRoll(knight.getName(),knightRoll);
            view.displayRoll(monster.getName(), monsterRoll);
            knight.addDamage((monsterRoll+monster.getPower()) - knight.getArmor());
            monster.addDamage((knightRoll+knight.getPower()) - monster.getArmor());
        }
        if(knight.getRemainingHealth() > 0) {
            view.display(String.format("Victory to %s%n", knight.getName()));
            knight.setXp(knight.getXp() + monster.getXp());
        }else {
            view.display(String.format("Victory to %s%n", monster.getName()));
        }
        knight.reset();
    }

    /**
     * Shows the combat cards for the knight and monster, in a 'verses' battle matchup style
     * @param knightCard the knight object
     * @param monsterCard  the  monster object
     */
    public void displayBattle(String knightCard, String monsterCard) {
        view.display("***** Battle Between *****\n");
        view.display(knightCard);
        view.display("              VS.\n");
        view.display(monsterCard);
    }

    /**
     * Basic constructor for the combat engine. It needs a view passed for it to work.
     * @param view an RtView object
     */
    RtCombatEngine(RtView view) {
        this.view = view;
    }


}
