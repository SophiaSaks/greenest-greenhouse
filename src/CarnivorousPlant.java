//arv från Plant
public class CarnivorousPlant extends Plant implements DailyWatering{

    public CarnivorousPlant(String name, double heightInCm){

        super(name, PlantType.CARNIVOROUSPLANT, heightInCm);
    }

    @Override
    public String dailyWatering(double heightInCm) {
        return "Your" + heightInCm + "CM tall carnivorous plant needs" +
                PlantType.CARNIVOROUSPLANT.getLitersPerDay() * (0.2 * heightInCm )+
                "liters of" + PlantType.CARNIVOROUSPLANT.getLiquidType() +
                "per day";

    }
}
