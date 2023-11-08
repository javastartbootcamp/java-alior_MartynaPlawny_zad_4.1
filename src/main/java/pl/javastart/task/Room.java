package pl.javastart.task;

public class Room {
    private int square;
    private String name;
    private double temperature;
    private boolean airConditioner;
    private double lowestTemperature = 21;

    public Room(String name, double temperature, boolean airConditioner) {
        this.name = name;
        this.temperature = temperature;
        this.airConditioner = airConditioner;
    }

    public Room(int square, String name, double temperature, boolean airConditioner, double lowestTemperature) {
        this.square = square;
        this.name = name;
        this.temperature = temperature;
        this.airConditioner = airConditioner;
        this.lowestTemperature = lowestTemperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getName() {
        return name;
    }

    public boolean reduceTemperature() {

        if (this.airConditioner) {
            if (this.temperature - this.lowestTemperature >= 1) {
                this.temperature = this.temperature - 1;
                return true;
            } else if (this.temperature - this.lowestTemperature > 0) {
                this.temperature = this.lowestTemperature;
                return true;
            }
        }
        return false;
    }
}