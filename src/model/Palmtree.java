package model;

//arv från plant
public class Palmtree extends Plant{

    public Palmtree(String name, double heightInCm){
        super(name, PlantType.PALMTREE, heightInCm);
    }

    //polymorfism
    @Override
    public String dailyWatering(double heightInCm) {
            return "Your " + heightInCm + " CM tall palmtree needs " +
                    (PlantType.PALMTREE.getLitersPerDay() * heightInCm) +
                    " liters of " + PlantType.PALMTREE.getLiquidType() +
                    " per day ";
    }
}
