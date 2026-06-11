public class Wand {
    private String core;
    private double lenght;

    public Wand(String core, double lenght) {
        this.core = core;
        this.lenght = lenght;
    }

    @Override
    public String toString() {
        return lenght + "\" wand with " + core + "core";
    }

    public double getPowerModifier()
    {
       switch(core){
           case "Phoenix Feather" : return 1.3;
           case "Dragon Heartstring" : return 1.5;
           case "Unicorn Hair" : return 1.1;
           default: return 1.0;
       }


    }
}
