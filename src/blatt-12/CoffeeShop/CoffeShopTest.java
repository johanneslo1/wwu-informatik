package CoffeeShop;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoffeShopTest {

    @Test
    public void testOrder() {
        // Bankkonto mit startguthaben=0
        Order order = new Order("Johannes Lohmann");

        assertEquals("Johannes Lohmann", order.customerName);


        IsOrderable[] items = new IsOrderable[3];
        items[0] = new Cappuccino(Coffee.Size.SMALL); // 1.99f
        items[1] = new Cappuccino(Coffee.Size.LARGE); // 3.99f
        items[2] = new LatteMacchiato(Coffee.Size.LARGE); // // 4.99f


        order.addItems(items);

        assertEquals(3, order.orderItems.length);

        assertEquals(10.969999f, order.getTotalPrice());

    }

}
