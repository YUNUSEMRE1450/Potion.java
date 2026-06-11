import java.util.ArrayList;
import java.util.Random;

public class Wizard {
    private String name;
    private int health; // current value for Wizard's health
    private int maxHealth;
    private House house;

    private Wand wand;

    private ArrayList<Spell> spellBook;
    private ArrayList<Potion> pocket;

    public Wizard(String name, House house, Wand wand, int maxHealth) {
        this.name = name;
        this.house = house;
        this.wand = wand;
        this.maxHealth = maxHealth;
        this.health = maxHealth;

        this.spellBook = new ArrayList<>();
        this.pocket = new ArrayList<>();
    }

    public void learnSpell(Spell spell)
    {
        spellBook.add(spell);
    }

    public void findPotion(Potion potion)
    {
        pocket.add(potion);
    }

    public boolean isAlive()
    {
        return this.health>0;
    }

    public String getName() {
        return name;
    }
    public int getPotionCount()
    {
        return pocket.size();
    }

    private void takeDamage(int damage)
    {
       health -= damage;
       if(health < 0) health = 0;
    }

    public void usePotion()
    {
        if(pocket.isEmpty()){
            System.out.println("You cannot use a potion when you have no pocket");
        }
       Potion firstPotion = pocket.get(0);
        health += firstPotion.getHealAmount();
        if(health > maxHealth){
            health = maxHealth;
        }
        pocket.remove(firstPotion);
    }

    public void castSpell(Wizard target)
    {
        if(spellBook.isEmpty()){
            System.out.println("You cannot cast a spell when you have no spell book");
            return;
        }
        Random rand = new Random();
        Spell spell = spellBook.get(rand.nextInt(spellBook.size()));
        System.out.println("Casting spell: " + spell.getName());
        if(spell.checkSuccess()){
            int finalDamage = (int) (spell.getBaseDamage() * wand.getPowerModifier());
            target.takeDamage(finalDamage);
            System.out.println("Damage : " + finalDamage);

        }
        else{
            System.out.println("spell did not hit!");
        }
        System.out.println("health "+health+" / "+maxHealth);
    }
}
