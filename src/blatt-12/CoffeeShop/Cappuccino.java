package CoffeeShop;

public class Cappuccino extends Coffee{
    public Cappuccino(Size size) {
        super("Cappuccino", size);
    }



    public float getPrice() {
        if(size == Size.SMALL) {
            return 1.99f;
        } else if(size == Size.MEDIUM) {
            return 2.99f;
        } else {
            return 3.99f;
        }
    }
}
