package model;

//arv från Plant
public class Cactus extends Plant {

    public Cactus(String name, double heightInMeters){
        super(name, PlantType.CACTUS, heightInMeters);
    }

    //Polymorfism
    @Override
    public String dailyWatering() {
        return "Your " + getheightInMeters() + " M tall cactus needs " +
                PlantType.CACTUS.getLitersPerDay() +
                " liters of " +
                PlantType.CACTUS.getLiquidType() +
                " per day";
    }
}
