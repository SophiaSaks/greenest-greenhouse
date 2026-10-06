package model;

public enum PlantType {
    PALMTREE("tapwater", 0.5),
    CARNIVOROUSPLANT("proteindrink", 0.1),
    CACTUS("mineralwater", 0.2);

    private final String liquidType;
    private final double litersPerDay;

    public String getLiquidType() {
        return liquidType;
    }

    public double getLitersPerDay() {
        return litersPerDay;
    }

    PlantType(String liquidType, double litersPerDay){
        this.liquidType = liquidType;
        this.litersPerDay = litersPerDay;
    }
}

