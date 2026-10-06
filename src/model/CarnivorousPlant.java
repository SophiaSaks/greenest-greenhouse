package model;

import java.text.DecimalFormat;

//arv från model.Hotel.model.Plant
public class CarnivorousPlant extends Plant {

    public CarnivorousPlant(String name, double heightInCm){

        super(name, PlantType.CARNIVOROUSPLANT, heightInCm);
    }

    public static String dailyWatering(double heightInCm) {
        DecimalFormat df = new DecimalFormat("####0.00");
        double value = PlantType.CARNIVOROUSPLANT.getLitersPerDay() * (0.2 * heightInCm);
        return "Your " + heightInCm + " CM tall carnivorous plant needs " +
                df.format(value )+
                " liters of " + PlantType.CARNIVOROUSPLANT.getLiquidType() +
                " per day";

    }
}
