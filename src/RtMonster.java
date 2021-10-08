import java.util.Random;

/**
 * Simple monster class. Students do not need to modify this file, but should  use
 * it as an example for knight.
 *
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class RtMonster {
    public static Random rnd = new Random();

    private int health;
    private int damage = 0;
    private int xp = 5;  // all monsters just give 5 xp now
    private int armor;
    private int power;
    private String name;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;  
    }

    public int getRemainingHealth() {
        return health - damage;
    }

    public void addDamage(int amount) {
        damage += amount;
    }

    public int getXp() {
        return xp;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCard() {
        return "+============================+\n" +
                String.format("| %-27s|%n", getName()) +
                "|                            |\n" +
                String.format("| Health: %-5d  Power: %-4d |%n", getHealth(), getPower())  +
                String.format("|        Armor: %-13d|%n", getArmor()) +
                "|                            |\n" +
                "+============================+\n";
    }

    public RtMonster(String name,  int health, int armor, int power) {
        setName(name);
        setHealth(health);
        setArmor(armor);
        setPower(power);
    }

    public static RtMonster generateRandomMonster() {
        return new RtMonster(randomMonsterName(),
                50 + rnd.nextInt(50),
                25 + rnd.nextInt(15),
                50 + rnd.nextInt(50));
    }

    public static String randomMonsterName() {
        int val = rnd.nextInt(5);
        String monsterName;
        if(val == 0) {
            monsterName = "Cyclops";
        }else if(val == 1) {
            monsterName =  "Dark Knight";
        }else if(val == 2) {
            monsterName = "Ogre";
        }else if(val == 3) {
            monsterName = "Twrch Trwyth"; //  the great boar
        }else  {
            monsterName = "Wyvern";
        }
        return monsterName;
    }

}
