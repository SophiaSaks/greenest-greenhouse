package model;

import java.text.DecimalFormat;

//arv från model.Hotel.model.Plant
public class CarnivorousPlant extends Plant {

    public static final double LITERS_FOR_HEIGHT = 0.2;


    public CarnivorousPlant(String name, double heightInCm){

        super(name, PlantType.CARNIVOROUSPLANT, heightInCm);
    }


    @Override
    public String getDailyWatering(double heightInCm) {
        DecimalFormat df = new DecimalFormat("####0.00");
        double value = PlantType.CARNIVOROUSPLANT.getLitersPerDay() * (LITERS_FOR_HEIGHT * heightInCm);
        return "Your " + heightInCm + " CM tall carnivorous plant needs " +
                df.format(value )+
                " liters of " + PlantType.CARNIVOROUSPLANT.getLiquidType() +
                " per day";

    }
}
