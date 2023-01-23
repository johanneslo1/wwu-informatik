package uebung06;

public class TaskSystem {

	public static void main(String[] args) {
		Task[] tasks = new Task[4];
		tasks[0] = new WorkTask("Mails beantworten");
		tasks[1] = new GeneralTask("Einkaufen", "Bringe Kuchen mit.");
		tasks[2] = new WorkTask("Feature implementieren");
		tasks[3] = new GeneralTask("Wohnung putzen");
		// Lege alles, bis auf die letzte Aufgabe auf Samstag
		for(int i = 0; i < tasks.length-1; i++) {
			tasks[i].schedule(Day.SATURDAY);
		}

		// Gebe aus, ob die Tasks am Wochenende stattfinden oder nicht
		for(int i = 0; i < tasks.length; i++) {
			String partOfWeek = "(nicht geplant)";
			// Prüfe ob der Wochentag gesetzt ist
			if(tasks[i].getDay() != null) {
				switch (tasks[i].getDay()) {
				case SATURDAY:
				case SUNDAY:
					partOfWeek = "Wochenende";
					break;
				default:
					partOfWeek = "Wochentag";
				}
			}
			System.out.println("Die Aufgabe \"" + tasks[i].getName() + "\" ist fällig am " + partOfWeek);
		}


		Project project = new Project("Meine Daily-Todos", tasks);

		project.complete();
	}

}
