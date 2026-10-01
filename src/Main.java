import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    static void main(String[] args) {
        addInitialPlants();

        System.out.println("Vilken växt ska få vätska?");
        String answer = scanner.nextLine();

        switch(answer.toLowerCase(Locale.ROOT).trim()){
            case "igge" -> System.out.println("Hej");
            case "laura" -> System.out.println("test");
            case "meatloaf" -> System.out.println("hejhej");
            case "olof" -> System.out.println("testtest");
            default -> System.out.println("Den växten finns inte på vårat hotell!");
        }
    }


    static void addInitialPlants(){
        Cactus Igge = new Cactus("Igge", 20);
        Palmtree Laura = new Palmtree("Laura", 20);
        CarnivorousPlant Meatloaf = new CarnivorousPlant("Meatloaf", 70);
        Palmtree Olof = new Palmtree("Olof", 100);
    }
}
