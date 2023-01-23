package uebung06;

/**
 * Die Klasse modelliert eine allgemeine Aufgabe, 
 * die auch eine Notiz speichern kann
 */
public class GeneralTask extends Task {
	// Das Attribut der Klasse ist eine Notiz.
	private String notiz;

	/**
	 * Konstruktor
	 * @param name Name der Aufgabe
	 */
	public GeneralTask(String name) {
		super(name);
	}
	
	/**
	 * Konstruktor
	 * @param name Name der Aufgabe
	 * @param notiz Notiz zur Aufgabe
	 */
	public GeneralTask(String name, String notiz) {
		super(name);
		this.notiz = notiz;
	}
	
	/**
	 * Liefert die Notiz zurück
	 * @return Notiz
	 */
	public String getNotiz() {
		return notiz;
	}

	/**
	 * Setzt den fälligen Tag. 
	 * @param day Der Wochentag
	 */
	public void schedule(Day day) {
		this.day = day;
	}

}
