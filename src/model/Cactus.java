package model;

//arv från model.Hotel.model.Plant och implementerar interfacet DailyWatering
public class Cactus extends Plant implements DailyWatering {

    public Cactus(String name, double heightInCm){
        super(name, PlantType.CACTUS, heightInCm);
    }

    @Override
    public String dailyWatering(double heightInCm) {
        return "Your " + heightInCm + " CM tall cactus needs " +
                PlantType.CACTUS.getLitersPerDay() +
                " liters of " +
                PlantType.CACTUS.getLiquidType() +
                " per day";
    }
}
