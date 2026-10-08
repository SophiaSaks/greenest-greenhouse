package model;

import java.text.DecimalFormat;

public abstract class Plant implements DailyWatering{
    //inkapsling på name, plantType och heightInCm
    private String name;
    private PlantType plantType;
    private double heightInCm;

    public String getName() {
        return name;
    }

    public double getheightInCm(){return heightInCm; }

    public Plant(String name, PlantType plantType, double heightInCm){
        this.name = name;
        this.plantType = plantType;
        this.heightInCm = heightInCm;
    }

    @Override
    public String dailyWatering(double heightInCm) {
        return "This plant does not have a specific watering calculcation yet!";
    }


}