package uebung06;

/**
 * Die Klasse modelliert eine Aufgabe mit
 * einem Namen und einem Wochentag, an dem
 * sie fällig ist
 */
public abstract class Task {
	/*
	 * Die Attribute der Klasse sind ein Name
	 * und der Wochentag, an dem die Aufgabe fällig ist
	 */
	protected String name;
	protected Day day;

	protected boolean completed = false;
	
	/**
	 * Konstruktor
	 * @param name Der Name der Aufgabe
	 */
	public Task(String name) {
		this.name = name;
	}
	
	/**
	 * Liefert den Namen zurück
	 * @return Name der Aufgabe
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Liefert den Tag zurück
	 * @return Tag der Fälligkeit
	 */
	public Day getDay() {
		return day;
	}
	
	public abstract void schedule(Day day);

	public boolean isCompleted() {
		return completed;
	}

	public void complete() {
		completed = true;
	}

	public void uncomplete() {
		completed = false;
	}
}
