/**
 * Knights  love their  fortune told,  this file  generates
 * a tarot card for them to  figure out their fortune. However,
 * it generates not the standard deck, but one focused on the knightly virtues.
 *
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class RtTarotDeck {


    /**
     * Gets a tarot card based on the category  and the value passed in. Category wise
     * 1 ==  Cups
     * 2 ==  Wands
     * 3 ==  Coins
     * 4 ==  Swords
     * anything  else == major arcana
     * uses the minor arcana and major arcana methods to generate them
     * @param category the category (suit)
     * @param value the value of the card
     * @return a string representing the card
     */
    public static String getTarotCard(int category, int value) {
        String card = "";
        // you will find a better way to do this if statement in the future using switch statements
        if(category == 1) {  // cursed destiny
            card =  minorArcana("Cups", value);
        }else if(category==2) { // average destiny
            card = minorArcana("Wands", value);
        }else if(category==3) { // villains destiny
            card = minorArcana("Coins", value);
        }else if(category==4) {  // heroes destiny
            card = minorArcana("Swords", value);
        }else {
            card = majorArcana(value);
        }
        return card;

    }

    /**
     * Returns a major arcana based on value passed in (between 1 and 30)
     * 1 or 2 - Prowess
     * 3 -  Valor
     * 4 -  Excellence
     * 5,6,7 - Justice
     * 8 -  Temperance
     * 9 -  Loyalty
     * 10 - Obedience
     * 11 - Faithfulness
     * 12 - Defense
     * 13 - Selflessness
     * 14 - Sacrifice
     * 15 - Courage
     * 16 - Integrity
     * 17 - Honesty
     * 18 - Faith
     * 19 - Perseverance
     * 20,21 - Wisdom
     * 22 - Humility
     * 23 - Morality
     * 24 - Largesse
     * 25 - Generosity
     * 26 - Kindness
     * 27 - Nobility
     * 28 - Charity
     * 29 - Franchise
     * 30 - Accountability
     *
     * Defaults to King
     * Values returned must have === The NAME ===\n
     * Consider using String.format("=== The %s ===%n", cardName);
     *
     * @param value the value of the arcana
     * @return a string with === The name ===\n format
     */
    public static String majorArcana(int value) {
        String cardName = "King";
        if(value <= 2) {
        	cardName = "Prowess";
        }	else if(value == 3) {
        	cardName = "Valor";
        }	else if(value == 4) {
        	cardName = "Excellence";
        }	else if(value <= 7) {
        	cardName = "Justice";
        }	else if(value == 8) {
        	cardName = "Temperance";
        }	else if(value == 9) {
        	cardName = "Loyalty";
        }	else if(value == 10) {
        	cardName = "Obedience";
        }	else if(value == 11) {
        	cardName = "Faithfulness";        	
        }	else if(value == 12) {
        	cardName = "Defense";        	
        }	else if(value == 13) {
        	cardName = "Selflessness";
        }	else if(value == 14) {
        	cardName = "Sacrifice";
        }	else if(value == 15) {
        	cardName = "Courage";
        }	else if(value == 16) {
        	cardName = "Integrity";
        }	else if(value == 17) {
        	cardName = "Honesty";
        }	else if(value == 18) {
        	cardName = "Faith";
        }	else if(value == 19) {
        	cardName = "Perserverance";
        }	else if(value <= 21) {
        	cardName = "Wisdom";
        }	else if(value == 22) {
        	cardName = "Humility";
        }	else if(value == 23) {
        	cardName = "Morality";
        }	else if(value == 24) {
        	cardName = "Largesse";
        }	else if(value == 25) {
        	cardName = "Generosity";
        }	else if(value == 26) {
        	cardName = "Kindness";
        }	else if(value == 27) {
        	cardName = "Nobility";
        }	else if(value == 28) {
        	cardName = "Charity";
        }	else if(value == 29) {
        	cardName = "Franchise";
        }	else {
        	cardName = "Accountability";
        }             
        return String.format("=== The %s ===%n", cardName);
    }

    /**
     * Returns a care of suit and value as passed in. The values are as follows
     *
     * 1,2 - Ace
     * 3,4 - Two
     * 5,6 - Three
     * (and so on until)
     * 19,20 - Ten
     * 21,22 - Page
     * 23,24,25,26 - Knight
     * 27,28 - Queen
     * 29,30 - King
     *
     *  Consider using - String.format("=== %s of %s ===%n", cardName, deck)
     * @param deck the deck,  just  used directly in the return
     * @param value the value of the card to convert to a readable form
     * @return format === card of deck ===\n
     */
    public static String minorArcana(String deck, int value) {
        String cardName = "";
        if(value <= 2) {
        	cardName = "Ace";
        }   else if(value <= 4) {
        	cardName = "Two";
        }	else if(value <= 6) {
        	cardName = "Three";
        }	else if(value <= 8) {
        	cardName = "Four";
        }	else if(value <= 10) {
        	cardName = "Five";
        }	else if(value <= 12) {
        	cardName = "Six";
        }	else if(value <= 14) {
        	cardName = "Seven";
        }	else if(value <= 16) {
        	cardName = "Eight";
        }	else if(value <= 18) {
        	cardName = "Nine";
        }	else if(value <= 20) {
        	cardName = "Ten";
        }	else if(value <= 22) {
        	cardName = "Page";     //Jack but cooler
        }	else if(value <= 26) {
        	cardName = "Knight";   
        }	else if(value <= 28) {
        	cardName = "Queen";
        }	else {
        	cardName = "King";
        }
        return String.format("=== %s of %s ===%n", cardName, deck);
    }

}
