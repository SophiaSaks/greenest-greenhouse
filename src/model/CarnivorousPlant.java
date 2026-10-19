package model;

import java.text.DecimalFormat;

//arv från Plant
public class CarnivorousPlant extends Plant {
    public static final double LITERS_FOR_HEIGHT = 0.2;

    public CarnivorousPlant(String name, double heightInMeters){
        super(name, PlantType.CARNIVOROUSPLANT, heightInMeters);
    }

    //polymorfism
    @Override
    public String dailyWatering(double heightInMeters){
        DecimalFormat df = new DecimalFormat("####0.00");
        double value = PlantType.CARNIVOROUSPLANT.getLitersPerDay() + (LITERS_FOR_HEIGHT * heightInMeters);
        return "Your " + heightInMeters + " M tall carnivorous plant needs " +
                df.format(value )+
                " liters of " + PlantType.CARNIVOROUSPLANT.getLiquidType() +
                " per day";
    }
}
