package model;

//implementerar DailyWaterings interface

public abstract class Plant implements DailyWatering{
    //inkapsling på name, plantType och heightInCm så man inte kommer åt de utifrån klassen
    private String name;
    private PlantType plantType;
    private double heightInCm;

    //Getters så att vi kan läsa värden utanför denna klass
    public String getName() {
        return name;
    }

    public double getheightInCm(){return heightInCm; }

    public Plant(String name, PlantType plantType, double heightInCm){
        this.name = name;
        this.plantType = plantType;
        this.heightInCm = heightInCm;
    }

    //standard-metod alla separata växter får göra om till sina egna
    @Override
    public String dailyWatering(double heightInCm) {
        return "This plant does not have a specific watering instruction yet!";
    }


}