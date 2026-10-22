package model;

public class CarnivorousPlant extends Plant {
    public static final double LITERS_FOR_HEIGHT = 0.2;

    public CarnivorousPlant(String name, double heightInMeters){
        super(name, PlantType.CARNIVOROUSPLANT, heightInMeters);
    }

    @Override
    public String dailyWatering(){
        double value = PlantType.CARNIVOROUSPLANT.getLitersPerDay() + (LITERS_FOR_HEIGHT * getheightInMeters());
        return "Your " + getheightInMeters() + " M tall carnivorous plant needs " +
                 value +
                " liters of " + PlantType.CARNIVOROUSPLANT.getLiquidType() +
                " per day";
    }
}
