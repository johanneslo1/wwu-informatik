package bestellung;

public class GruppenKonto extends Konto{

    private final Konto[] konten;

    public GruppenKonto(String name, Konto[] konten) {
        super(name);
        this.konten = konten;
    }

    @Override
    public float berechneDiscount() {
        // Nehme den kleinsten Discount der 3 assoziierten Konten
        if(this.konten.length == 0) {
            return 0;
        }

        float discount = this.konten[0].berechneDiscount();

        for(int i = 1; i < this.konten.length; i++) {
            if(this.konten[i].berechneDiscount() < discount) {
                discount = this.konten[i].berechneDiscount();
            }
        }

        return discount;
    }
}
