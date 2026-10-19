package model;

//implementerar DailyWaterings interface

public abstract class Plant implements DailyWatering{
    //inkapsling på name, plantType och heightInCm så man inte kommer åt de utifrån klassen
    private String name;
    private PlantType plantType;
    private double heightInMeters;

    //Getters så att vi kan läsa värden utanför denna klass
    public String getName() {
        return name;
    }

    public double getheightInCm(){return heightInMeters; }

    public Plant(String name, PlantType plantType, double heightInCm){
        this.name = name;
        this.plantType = plantType;
        this.heightInMeters = heightInCm;
    }

    //abstrakt metod alla separata växter får göra om till sina egna
    @Override
    public abstract String dailyWatering(double heightInMeters);


}