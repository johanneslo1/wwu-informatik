package Polymorphismus;

public class LandVehicle extends Vehicle {
    protected String name = "LandVehicle";

    public String getName() {
        return name;
    }

    public String getSign(String number) {
        return "LV-" + number;
    }
}
