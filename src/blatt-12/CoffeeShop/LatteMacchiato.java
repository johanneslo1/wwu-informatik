package CoffeeShop;

public class LatteMacchiato extends Coffee {
    public LatteMacchiato(Size size) {
        super("Latte Macchiato", size);
    }


    public float getPrice() {
        if(size == Size.SMALL) {
            return 2.99f;
        } else if(size == Size.MEDIUM) {
            return 3.99f;
        } else {
            return 4.99f;
        }
    }
}
