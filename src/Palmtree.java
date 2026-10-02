//arv från Plant
public class Palmtree extends Plant implements DailyWatering{

    public Palmtree(String name, double heightInCm){
        super(name, PlantType.PALMTREE, heightInCm);

    }

    @Override
    public String dailyWatering(double heightInCm) {
            return "Your" + heightInCm + "CM tall palmtree needs" +
                    (PlantType.PALMTREE.getLitersPerDay() * heightInCm) +
                    "liters of" + PlantType.PALMTREE.getLiquidType() +
                    "per day";
    }

}
