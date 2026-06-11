import java.util.Random;

public class Spell {
    private String name;
    private int baseDamage;
    private double accuracy;

    public Spell(String name, int baseDamage, double accuracy) {
        this.name = name;
        this.baseDamage = baseDamage;
        this.accuracy = accuracy;
    }

    public String getName() {
        return name;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public boolean checkSuccess()
    {
        Random random = new Random();
        double value = random.nextDouble();

        if ( value<= this.accuracy) {
            return true;
        } else {
            return false;
        }
    }
}
