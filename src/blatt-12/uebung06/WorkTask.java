package uebung06;

/**
 * Die Klasse modelliert eine Aufgabe mit Bezug zur Arbeit,
 * wo die Aufgabe zusätzlich eine zuständige Person hat.
 */
public class WorkTask extends Task {
	// Das Attribut ist der Name der zuständigen Person
	private String asignee;

	/**
	 * Konstruktor
	 * @param name Name der Aufgabe
	 */
	public WorkTask(String name) {
		super(name);
	}

	/**
	 * Liefert den Namen der zuständigen Person zurück
	 * @return Name der Person
	 */
	public String getAsignee() {
		return asignee;
	}

	/**
	 * Setzt den fälligen Tag. Wenn ein Tag am Wochenende
	 * übergeben wird, wird der Montag festgelegt.
	 * @param day Der Wochentag
	 */
	public void schedule(Day day) {
		switch(day) {
		case SATURDAY:
			// Hier wird ausgenutzt, dass die nächste Anweisung ausgeführt wird,
			// wenn kein break genutzt wird.
		case SUNDAY:
			this.day = Day.MONDAY;
			break;
		default:
			this.day = day;
		}
	}

	/**
	 * Setzt den fälligen Tag und die zuständige Person. 
	 * Wenn ein Tag am Wochenende
	 * übergeben wird, wird der Montag festgelegt.
	 * @param day Der Wochentag
	 * @param asignee Die zuständige Person
	 */
	public void schedule(Day day, String asignee) {
		schedule(day);
		this.asignee = asignee;
	}
}
