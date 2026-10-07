package ui;
import model.*;
import model.Cactus;
import model.CarnivorousPlant;
import model.Palmtree;
import java.util.Scanner;

/*TODO:
Uppfyller arraylisten ett syfte i min kod? Kolla vad som är best practises
kolla över variabelnamn, hårdkodade värden
switchen tillräcklig felhantering?
polymorfism, interface
lägg kommentarer vart jag använder polymorfism, inkapsling, arv
inga hårdkodade strängar heller
 */

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Hotel hotel = new Hotel("Greenest");

    static void main(String[] args) {
        addInitialPlants();
        boolean isRunning = true;
        String whichPlant = "Which plant needs watering?";
        String nonExistentPlant = "Sorry, we could not find that plant and our hotel!";

        while(isRunning){

            System.out.println(whichPlant);
            String answer = scanner.nextLine();
            answer = answer.toLowerCase().trim();


            switch(answer){
                case "igge" -> System.out.println(Cactus.dailyWateringCactus(20));
                case "laura" -> System.out.println(Palmtree.dailyWateringy(500));
                case "meatloaf" -> System.out.println(CarnivorousPlant.dailyWatering(70));
                case "olof" -> System.out.println(Palmtree.dailyWateringy(100));
                default -> System.out.println(nonExistentPlant);
            }
        }
    }

    static void addInitialPlants(){
      hotel.add(new Cactus("Igge", 20));
      hotel.add(new Palmtree("Laura", 500));
      hotel.add(new CarnivorousPlant("Meatloaf", 70));
      hotel.add(new Palmtree("Olof", 100));
    }



}
