public class Plant {
    private String name;
    private float height;
    private Liquid liquid;

    public String getName() {
        return name;
    }

    public float getHeight() {
        return height;
    }


    public Liquid getLiquid() {
        return liquid;
    }

    public Plant(Liquid liquid){
        this.liquid = liquid;
    }

}
