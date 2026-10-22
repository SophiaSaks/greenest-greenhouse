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
            answer = answer.trim();

            Plant plant = hotel.findPlant(answer);

            try{
            System.out.println(plant.dailyWatering());
            } catch (NullPointerException e){
                System.out.println(nonExistentPlant);
            }

        }
        scanner.close();
    }

    static void printMenu(){
        System.out.println("\u001b[32;1mWhich plant needs watering?\u001b[0m");
    }

    static void addInitialPlants(){
        hotel.add(new Cactus("Igge", 0.2));
        hotel.add(new Palmtree("Laura", 5));
        hotel.add(new CarnivorousPlant("Meatloaf", 0.7));
        hotel.add(new Palmtree("Olof", 1));
    }

}
