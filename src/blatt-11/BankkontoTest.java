import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankkontoTest {

    /**
     * Test für Bankkonto
     */
    @Test
    public void testBankkonto() {
        // Bankkonto mit startguthaben=0
        Bankkonto bankkonto = new Bankkonto(1337, 0);
        assertEquals(1337, bankkonto.getId());
        bankkontoTest(bankkonto);
    }

    /**
     * Methode um allgemeine Bankkonto-Funktionalität zu prüfen.
     * Insgesamt 4 Transaktionen.
     *
     * @param bankkonto
     */
    public void bankkontoTest(Bankkonto bankkonto) {
        int betrag = 40;
        int tmpGuthaben = bankkonto.getGuthaben();
        // Teste negative Einzahlung
        bankkonto.einzahlen(-betrag);
        assertEquals(tmpGuthaben, bankkonto.getGuthaben());

        // Teste korrekte Einzahlung
        bankkonto.einzahlen(betrag);
        assertEquals(tmpGuthaben + betrag, bankkonto.getGuthaben());

        // Teste negative abhebung
        bankkonto.abheben(-betrag);
        assertEquals(tmpGuthaben + betrag, bankkonto.getGuthaben());

        // Teste korrekte Abhebung
        bankkonto.abheben(betrag);
        assertEquals(tmpGuthaben, bankkonto.getGuthaben());
    }

    /**
     * Test für Sparkonto
     */
    @Test
    public void testSparkonto() {
        // Erstelle Sparkonto mit startguthaben=0 und zinsen=0.1
        Sparkonto sparkonto = new Sparkonto(1337, 0, 0.1f);
        bankkontoTest(sparkonto);

        // Zahle 100 ein und prüfe, ob Abhebungen > 100 geblockt werden.
        sparkonto.einzahlen(100);
        sparkonto.abheben(110);
        assertEquals(100, sparkonto.getGuthaben());

        // Das Konto hat ein Guthaben von 100. Zinszahlung entspricht 10.
        sparkonto.zinsenAuszahlen();
        assertEquals(110, sparkonto.getGuthaben());
    }

    /**
     * Test für Girokonto
     */
    @Test
    public void testGirokonto() {
        // Girokonto mit startguthaben=0 und dispo=50
        Girokonto girokonto = new Girokonto(1337, 0, 50);
        bankkontoTest(girokonto);

        // Überziehe Girokonto um 10
        girokonto.einzahlen(100);
        girokonto.abheben(110);
        assertEquals(-10, girokonto.getGuthaben());

        // Überziehe Girokonto um dispo=50
        girokonto.abheben(40);
        assertEquals(-50, girokonto.getGuthaben());

        // Versuche weitere 10 abzuheben. Strafzahlung von 20 wird abgebucht.
        girokonto.abheben(10);
        assertEquals(-70, girokonto.getGuthaben());

        // Insgesamt sind 8 Transaktionen auf dem Girokonto getätigt worden. -70 - (3 * 50) = 220
        girokonto.monatBeenden();
        assertEquals(-220, girokonto.getGuthaben());

        // Mache 5 Transaktionen. Keine Gebühr
        girokonto.einzahlen(1);
        girokonto.einzahlen(1);
        girokonto.einzahlen(1);
        girokonto.einzahlen(1);
        assertEquals(-216, girokonto.getGuthaben());
    }
}