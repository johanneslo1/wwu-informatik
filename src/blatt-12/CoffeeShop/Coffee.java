package CoffeeShop;

abstract public class Coffee implements IsOrderable {
    protected String name;

     protected Size size;
     public enum Size {
         SMALL, MEDIUM, LARGE
     }


    public Coffee(String name, Size size) {
        this.name = name;
        this.size = size;
    }

    public String getFullName() {
        return name + " " + size;
    }

    abstract public float getPrice();
}
