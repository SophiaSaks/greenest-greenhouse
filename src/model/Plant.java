package model;

public abstract class Plant implements DailyWatering{
    private String name;
    private PlantType plantType;
    private double heightInMeters;

    public String getName() {
        return name;
    }

    public double getheightInMeters(){return heightInMeters; }

    public Plant(String name, PlantType plantType, double heightInMeters){
        this.name = name;
        this.plantType = plantType;
        this.heightInMeters = heightInMeters;
    }

    @Override
    public abstract String dailyWatering();


}