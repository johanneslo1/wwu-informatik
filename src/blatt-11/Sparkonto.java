public class Sparkonto  extends Bankkonto {
    private final float zinsen;

    /**
     * Konstruktor
     *
     * @param kontonummer   Kontonummer des Kontos
     * @param startguthaben Startguthaben
     * @param zinsen        Zinsen
     */
    public Sparkonto(int kontonummer, int startguthaben, float zinsen) {
        super(kontonummer, startguthaben);
        this.zinsen = zinsen;
    }

    /**
     * Zahlt die Zinsen auf das Konto ein.
     */
    public void zinsenAuszahlen() {
        this.einzahlen(Math.round(this.getGuthaben() * this.zinsen));
    }


    /**
     * Hebt von dem Konto einen Betrag ab.
     * Das Konto kann dabei nicht überzogen werden.
     *
     * @param betrag
     */
    public void abheben(int betrag) {
        if (betrag > this.getGuthaben()) {
            System.out.println("ERROR_OVERDRAW");
            return;
        }
        super.abheben(betrag);

    }
}
