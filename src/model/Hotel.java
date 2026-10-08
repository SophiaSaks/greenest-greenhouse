package model;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Plant> plants = new ArrayList<Plant>();
    private String name;

    public Hotel(String name){
        this.name = name;
    }

    public void add(Plant plant){
        plants.add(plant);
    }

    public Plant findPlant(String name){
            for(Plant plant : plants) {
                if(plant.getName().equalsIgnoreCase(name)){
                    return plant;
                }
            }
            return null;
    }

}
