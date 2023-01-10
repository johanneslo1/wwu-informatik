package bestellung;

public class PremiumKonto extends Konto {

    private final float discount;

    public PremiumKonto(String name, float discount) {
        super(name);
        this.discount = discount;
    }

    @Override
    public float berechneDiscount() {
        return this.discount;
    }
}
