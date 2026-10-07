package model;

//arv från model.Hotel.model.Plant
public class Cactus extends Plant {

    public Cactus(String name, double heightInCm){
        super(name, PlantType.CACTUS, heightInCm);
    }

    @Override
    public String getDailyWatering(double heightInCm) {
        return "Your " + heightInCm + " CM tall cactus needs " +
                PlantType.CACTUS.getLitersPerDay() +
                " liters of " +
                PlantType.CACTUS.getLiquidType() +
                " per day";

    }
}
