import java.util.Scanner;

public class DuelArena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Wand harryWand = new Wand("Phoenix Feather",11.0);
        Wand voldemorthWand = new Wand("Dragon Heartstring",13.5);

        Wizard harry = new Wizard("Harry Potter", House.GRYFFINDOR,harryWand,100);
        Wizard voldemorth = new Wizard("Voldemorth",House.SLYTHERIN,voldemorthWand,120);

        Spell exp = new Spell("Expelliarmus",15, 0.9);
        Spell stupefy = new Spell("stupefy", 20,0.7);
        Spell avadaKedavra = new Spell("AvadaKedavra", 50,0.5);

        Potion wiggenweld = new Potion("Wiggenweld Potion",50);
        Potion pepperUp = new Potion("PepperUp Potion",15);

        harry.learnSpell(exp);
        harry.learnSpell(stupefy);
        harry.findPotion(wiggenweld);
        harry.findPotion(pepperUp);

        voldemorth.learnSpell(avadaKedavra);
        voldemorth.learnSpell(stupefy);
        voldemorth.findPotion(wiggenweld);

        while(harry.isAlive()&&voldemorth.isAlive()) {
            System.out.println("-----------------------------------");
            System.out.println("its your turn!! what you want to do?");
            System.out.println("1. Cast Spell");
            System.out.println("2. Use Potion (" + harry.getPotionCount() + ")");
            int input = scanner.nextInt();
            System.out.println("\n[Its your  turn]");
            if (input == 1) {
                harry.castSpell(voldemorth);
            } else if (input == 2) {
                harry.usePotion();
            } else {
                System.out.println("you didn't choose a valid option");
            }

            if (!voldemorth.isAlive()) {
                System.out.println("You Win");
                break;
            }

            System.out.println("\n[Voldemorth's turn]");
            voldemorth.castSpell(harry);

            if (!harry.isAlive()) {
                System.out.println("You Lose");
                break;
            }



        }
    }
}
