public class Plant {
    private String name;
    private double litersPerDay;
    private PlantType plantType;
    private double heightInCm;

    public String getName() {
        return name;
    }

    public double getliters() {
        return litersPerDay;
    }

    public PlantType getLiquid() {
        return plantType;
    }

    public Plant(String name, PlantType plantType, double heightInCm){
        this.name = name;
        this.plantType = plantType;
        this.heightInCm = heightInCm;
    }

}
