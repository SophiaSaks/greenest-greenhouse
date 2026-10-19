package model;

//arv från model.Hotel.model.Plant
public class Cactus extends Plant {

    public Cactus(String name, double heightInMeters){
        super(name, PlantType.CACTUS, heightInMeters);
    }

    //Polymorfism
    @Override
    public String dailyWatering(double heightInMeters) {
        return "Your " + heightInMeters + " M tall cactus needs " +
                PlantType.CACTUS.getLitersPerDay() +
                " liters of " +
                PlantType.CACTUS.getLiquidType() +
                " per day";
    }
}
