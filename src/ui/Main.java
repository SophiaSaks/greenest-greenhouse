package ui;
import model.*;
import model.Cactus;
import model.CarnivorousPlant;
import model.Palmtree;
import java.util.Scanner;

/*TODO:
kolla över variabelnamn, hårdkodade värden
polymorfism
lägg kommentarer vart jag använder polymorfism, inkapsling, arv
inga hårdkodade strängar heller
 */

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Hotel hotel = new Hotel("Greenest");

    static void main(String[] args) {
        addInitialPlants();
        boolean isRunning = true;
        String nonExistentPlant = "Sorry, we could not find that plant and our hotel!";

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
    }

    static void printMenu(){
        System.out.println("Which plant needs watering?");
    }

    static void addInitialPlants(){
      hotel.add(new Cactus("Igge", 20));
      hotel.add(new Palmtree("Laura", 500));
      hotel.add(new CarnivorousPlant("Meatloaf", 70));
      hotel.add(new Palmtree("Olof", 100));
    }



}
