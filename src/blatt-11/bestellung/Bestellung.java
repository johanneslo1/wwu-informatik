package bestellung;

public class Bestellung {

    private final Produkt[] produkte;
    private final Konto konto;
    private final String bestellDatum;

    public Bestellung(Produkt[] produkte, String bestellDatum, Konto konto) {
        this.produkte = produkte;
        this.bestellDatum = bestellDatum;
        this.konto = konto;
    }


    public String getBestellDatum() {
        return this.bestellDatum;
    }

    /**
     * Berechnet den Gesamtpreis (netto) der Bestellung
     *
     * @return float
     */
    public float nettoPreis() {
        float summe = this.getSumme();

        return summe - (summe * this.konto.berechneDiscount());
    }

    /**
     * Berechnet die Summe der Preise aller Produkte
     *
     * @return float
     */
    protected float getSumme() {
        float summe = 0;

        for (Produkt produkt : this.produkte) {
            summe += produkt.gesamtPreis();
        }

        return summe;
    }
}
