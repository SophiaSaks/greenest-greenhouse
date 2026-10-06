package ui;
import model.*;
import model.Cactus;
import model.CarnivorousPlant;
import model.Palmtree;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Hotel hotel = new Hotel("Greenest");

    static void main(String[] args) {
        addInitialPlants();
        boolean isRunning = true;

        while(isRunning){

            System.out.println("Vilken växt ska få vätska?");
            String answer = scanner.nextLine();
            answer = answer.toLowerCase().trim();

            switch(answer){
                case "igge" -> System.out.println(Cactus.dailyWateringCactus(20));
                case "laura" -> System.out.println(Palmtree.dailyWateringy(500));
                case "meatloaf" -> System.out.println(CarnivorousPlant.dailyWatering(70));
                case "olof" -> System.out.println(Palmtree.dailyWateringy(100));
                default -> System.out.println("Den växten finns inte på vårat hotell!");
            }
        }
    }

    static void addInitialPlants(){
        hotel.add(new Cactus("Igge", 20));
        hotel.add(new Palmtree("Laura", 500));
        hotel.add(new CarnivorousPlant("Meatloaf", 70));
        hotel.add(new Palmtree("Olof", 100));
    }

    static void hejhej(String answer){
       Plant hejhej =  hotel.findPlantByName(answer);
    }

}
