package model;

//arv från model.Hotel.model.Plant
public class Palmtree extends Plant  {

    public Palmtree(String name, double heightInCm){
        super(name, PlantType.PALMTREE, heightInCm);
    }

    @Override
    public String getDailyWatering(double heightInCm) {
            return "Your " + heightInCm + " CM tall palmtree needs " +
                    (PlantType.PALMTREE.getLitersPerDay() * heightInCm) +
                    " liters of " + PlantType.PALMTREE.getLiquidType() +
                    " per day ";
    }

}
