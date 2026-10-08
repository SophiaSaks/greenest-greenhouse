package model;

public abstract class Plant {
    //inkapsling på name, plantType och heightInCm
    private String name;
    private PlantType plantType;
    private double heightInCm;

    public String getName() {
        return name;
    }

    public PlantType getPlantType() {
        return plantType;
    }

    public double getheightInCm(){return heightInCm; }

    public Plant(String name, PlantType plantType, double heightInCm){
        this.name = name;
        this.plantType = plantType;
        this.heightInCm = heightInCm;
    }

}