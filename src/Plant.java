public class Plant {
    private String name;
    private double litersPerDay;
    private Liquid liquid;
    private double heightInCm;

    public String getName() {
        return name;
    }

    public double getliters() {
        return litersPerDay;
    }

    public Liquid getLiquid() {
        return liquid;
    }

    public Plant(String name, Liquid liquid, double litersPerDay, double heightInCm){
        this.name = name;
        this.liquid = liquid;
        this.litersPerDay = litersPerDay;
        this.heightInCm = heightInCm;
    }

}
