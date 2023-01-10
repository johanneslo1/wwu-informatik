package bestellung;

abstract public class Konto {

    public final String name;

    Konto(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    abstract public float berechneDiscount();
}
