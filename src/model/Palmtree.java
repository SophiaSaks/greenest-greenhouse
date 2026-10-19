package model;

//arv från plant
public class Palmtree extends Plant{

    public Palmtree(String name, double heightInMeters){
        super(name, PlantType.PALMTREE, heightInMeters);
    }

    //polymorfism
    @Override
    public String dailyWatering(double heightInMeters) {
            return "Your " + heightInMeters + " CM tall palmtree needs " +
                    (PlantType.PALMTREE.getLitersPerDay() * heightInMeters) +
                    " liters of " + PlantType.PALMTREE.getLiquidType() +
                    " per day ";
    }
}
