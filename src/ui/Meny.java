package ui;
import model.*;
import java.util.Scanner;

public class Meny {
    private static Scanner scanner = new Scanner(System.in);
    private static Hotel hotel = new Hotel("Greenest");

    static void menu() {
        addInitialPlants();
        boolean isRunning = true;
        String nonExistentPlant = "\u001b[31mSorry, we could not find that plant in our hotel!";

        while(isRunning){
            printMenu();
            String answer = scanner.nextLine();
            answer = answer.toLowerCase().trim();

            Plant plant = hotel.findPlant(answer);

            if(plant != null){
                System.out.println(plant.dailyWatering(plant.getheightInCm()));
            } else{
                System.out.println(nonExistentPlant);
            }
        }
        scanner.close();
    }

    static void printMenu(){
        System.out.println("\u001b[32;1mWhich plant needs watering?\u001b[0m");
    }

    static void addInitialPlants(){
        hotel.add(new Cactus("Igge", 20));
        hotel.add(new Palmtree("Laura", 500));
        hotel.add(new CarnivorousPlant("Meatloaf", 70));
        hotel.add(new Palmtree("Olof", 100));
    }

}
