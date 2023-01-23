package CoffeeShop;

public class CoffeeShop {

    public static void main(String[] args) {
        CoffeeShop shop = new CoffeeShop();
        shop.orderCoffee();
    }

    public void orderCoffee() {
        Coffee cappuccino = new Cappuccino(Coffee.Size.MEDIUM);
        System.out.println("Coffee: " + cappuccino.getFullName());
        System.out.println("Price: " + cappuccino.getPrice());


        Coffee latteMacchiato = new LatteMacchiato(Coffee.Size.MEDIUM);
        System.out.println("Coffee: " + latteMacchiato.getFullName());
        System.out.println("Price: " + latteMacchiato.getPrice());


        Order order = new Order("Johannes Lohmann");
        order.addItems(new IsOrderable[] {cappuccino, latteMacchiato});

        order.getOverview();
    }
}
