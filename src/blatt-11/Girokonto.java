public class Girokonto extends Bankkonto {
    private final int dispo;
    private int transactionCount;

    /**
     * Konstruktor
     *
     * @param kontonummer   Kontonummer des Kontos
     * @param startguthaben Startguthaben
     * @param dispo         Dispo
     */
    public Girokonto(int kontonummer, int startguthaben, int dispo) {
        super(kontonummer, startguthaben);
        this.dispo = dispo;
    }

    /**
     * Überprüft, ob der Betrag abgehoben werden kann.
     *
     * @param betrag Betrag
     * @return boolean
     */
    public boolean kannAbheben(int betrag) {
        return this.getGuthaben() + this.dispo >= betrag;
    }

    /**
     * Abheben eines Betrags
     *
     * @param betrag Betrag
     */
    public void abheben(int betrag) {
        this.transactionCount++;

        if (!this.kannAbheben(betrag)) {
            // Strafzahlung von 20 Cent
            // Werte diese automatische Abbuchung nicht als Transaktion. Argument: Sie wurde nicht vom Kunden veranlasst.
            super.abheben(20);
            return;
        }

        super.abheben(betrag);
    }

    public void einzahlen(int betrag) {
        this.transactionCount++;
        super.einzahlen(betrag);
    }

    /**
     * Prüft, ob das Konto in seiner Anzahl an kostenfreien Transaktionen überzogen wurde und bucht entsprechend eine Strafgebühr ab.
     */
    public void monatBeenden() {
        if (this.transactionCount > 5) {
            // Werte diese automatische Abbuchung nicht als Transaktion. Argument: Sie wurde nicht vom Kunden veranlasst.
            super.abheben(50 * (this.transactionCount - 5));
        }

        this.transactionCount = 0;
    }
}
