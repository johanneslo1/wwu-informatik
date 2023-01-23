package Polymorphismus;

public class WaterVehicle extends Vehicle {
    public String name = "WaterVehicle";
    protected String sign = "WV-XXX";

    public String getSign() {
        return sign;
    }

    public String swim() {
        return "Ein Wasserfahrzeug kann schwimmen!";
    }
}