public class Bankkonto {
    // Speichert das Guthaben
    private int guthaben;

    // Speichert die Kontonummer
    private int id;

    /**
     * Konstruktor
     *
     * @param kontonummer   Kontonummer des Kontos
     * @param startguthaben Startguthaben
     */
    public Bankkonto(int kontonummer, int startguthaben) {
        id = kontonummer;
        guthaben = startguthaben;
    }

    /**
     * Zahlt einen Betrag auf das Konto ein
     *
     * @param betrag
     */
    public void einzahlen(int betrag) {
        if (!(betrag > 0)) {
            System.out.println("ERROR_NEGATIVE_INPUT");
            return;
        }

        guthaben += betrag;
    }

    /**
     * Hebt von dem Konto einen Betrag ab.
     *
     * @param betrag
     */
    public void abheben(int betrag) {
        if (!(betrag > 0)) {
            System.out.println("ERROR_NEGATIVE_INPUT");
            return;
        }

        guthaben -= betrag;
    }

    /**
     * Gibt das Guthaben zurück.
     *
     * @return Guthaben des Kontos
     */
    public int getGuthaben() {
        return guthaben;
    }

    /**
     * Gibt die ID (Kontonummer) eines Kontos zurück.
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Eine Methode, die bei einer Konsenausgabe (z.B. siehe methode print) einen formatierten String zurück gibt.
     * Kann für die Programmierung und das dazugehörige Debugging genutzt werden.
     * Diese Methode ist nicht Teil einer Aufgabenstellung.
     *
     * @return
     */
    public String toString() {
        return "Konto " + getId() + ": " + "Guthaben = " + getGuthaben();
    }

    /**
     * Analog zu toString. Kann für die Programmierung und das dazugehörige Debugging genutzt werden.
     * Diese Methode ist nicht Teil einer Aufgabenstellung.
     */
    public final void print() {
        System.out.println(toString());
    }
}