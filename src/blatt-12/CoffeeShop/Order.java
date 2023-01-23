package CoffeeShop;

public class Order {
    protected final String customerName;
    protected IsOrderable[] orderItems;


    public Order(String customerName) {
        this.customerName = customerName;
    }

    public float getTotalPrice() {
        float totalPrice = 0;
        for (IsOrderable item : orderItems) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }


    public void addItems(IsOrderable[] items) {
        Integer oldLength = (orderItems != null ? orderItems.length : 0);

        if (items.length + oldLength > 3) {
            System.out.println("ERROR_ORDER_CAPACITY");
            return;
        }

        IsOrderable[] newOrderItems = new IsOrderable[oldLength + items.length];
        for (int i = 0; i < oldLength; i++) {
            newOrderItems[i] = orderItems[i];
        }
        for (int i = 0; i < items.length; i++) {
            newOrderItems[i + oldLength] = items[i];
        }
        orderItems = newOrderItems;
    }



    public void getOverview() {
        System.out.println("Bestellung für " + customerName + ":");

        for (IsOrderable item : orderItems) {
            System.out.println(item.getFullName() + " / " + item.getPrice() + "€");
        }


        System.out.println("Summe: " + getTotalPrice() + "€");
    }
}
