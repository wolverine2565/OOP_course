package lesson_4;


public class HotDrink {
    private int temperature;
    private float value;
    private String name;

    HotDrink(String name, float value, int temperature) {
        this.name = name;
        this.value = value;
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("%s  %.1f  %d", name, value, temperature);
    }

}