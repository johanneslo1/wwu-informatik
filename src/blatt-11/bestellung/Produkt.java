package bestellung;

public class Produkt {

    private final float anzahl;
    private final float preis;

    private final String name;

    Produkt(String name, float preis, int anzahl) {
        this.name = name;
        this.preis = preis;
        this.anzahl = anzahl;
    }


    public float gesamtPreis()
    {
        return this.preis * this.anzahl;
    }
}
