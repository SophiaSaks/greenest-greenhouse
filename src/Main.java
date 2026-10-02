import java.util.Locale;
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

            switch(answer.toLowerCase(Locale.ROOT).trim()){
                case "igge" -> System.out.println("hejhej");
                case "laura" -> System.out.println("test");
                case "meatloaf" -> System.out.println("hejhej");
                case "olof" -> System.out.println("testtest");
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
}
