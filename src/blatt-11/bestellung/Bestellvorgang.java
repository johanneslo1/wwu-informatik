package bestellung;

public class Bestellvorgang {
    public static void check(float price, int cnt, float expected) {
        if(Math.abs(price - expected) > 1e-3)
            System.err.println("Fehler in Nettopreis von Bestellung "+ cnt +": erwarte " + expected + " aber erhalte " + price + ".");
        else
            System.out.println("Nettopreis von Bestellung " + cnt + " (" + price + ") ist richtig.");
    }

    public static void main(String[] args) {
        // Erzeuge Konten
        Konto[] konten = new Konto[3];
        konten[0] = new PremiumKonto("Alonzo Church", 0.15f);
        konten[1] = new PremiumKonto("James Gosling", 0.22f);
        konten[2] = new PremiumKonto("Ada Lovelace", 0.12f);
        GruppenKonto gruppenKonto = new GruppenKonto("Computer Scientists", konten);

        // Erzeuge einige Produkte
        Produkt[] produkte = new Produkt[4];
        produkte[0] = new Produkt("Introduction to Mathematical Logic", 60.90f, 1);
        produkte[1] = new Produkt("Java in a Nutshell", 56.89f, 2);
        produkte[2] = new Produkt("Sketch of the Analytical Engine invented by Charles Babbage", 16.05f, 4);
        produkte[3] = new Produkt("Introduction to Functional Programming Using Haskell", 61.50f, 1);

        // Einkauf Konto 1
        Bestellung bestellung1 = new Bestellung(produkte, "01.01.2023", konten[0]);
        float nettoPreis1 = bestellung1.nettoPreis();
        System.out.println(konten[0].getName() + " hat am " + bestellung1.getBestellDatum() + " eine Bestellung um " + nettoPreis1 + " Euro getaetigt.");
        check(nettoPreis1, 1, 255.323f); // TODO: erwarteten Preis anpassen

        // Einkauf Gruppen Konto
        Bestellung bestellung2 = new Bestellung(produkte, "20.02.2023", gruppenKonto);
        float nettoPreis2 = bestellung2.nettoPreis();
        System.out.println(gruppenKonto.getName() + " hat am " + bestellung2.getBestellDatum() + " eine Bestellung um " + nettoPreis2 + " Euro getaetigt.");
        check(bestellung2.nettoPreis(), 2, 264.3344f); // TODO: erwarteten Preis anpassen
    }
}