package model;

public class Palmtree extends Plant{

    public Palmtree(String name, double heightInMeters){
        super(name, PlantType.PALMTREE, heightInMeters);
    }

    @Override
    public String dailyWatering() {
            return "Your " + getheightInMeters() + " M tall palmtree needs " +
                    (PlantType.PALMTREE.getLitersPerDay() * getheightInMeters()) +
                    " liters of " + PlantType.PALMTREE.getLiquidType() +
                    " per day ";
    }
}
