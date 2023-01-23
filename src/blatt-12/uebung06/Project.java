package uebung06;

public class Project {

    private final Task[] tasks;
    private final String name;

    public Project(String name, Task[] tasks) {
        this.name = name;
        this.tasks = tasks;
    }

    public void complete() {
        for (Task task : tasks) {
            task.complete();
        }
    }

    public void uncomplete() {
        for (Task task : tasks) {
            task.uncomplete();
        }
    }

    public int countCompletedTasks() {
        int count = 0;
        for (Task task : tasks) {
            if (task.isCompleted()) {
                count++;
            }
        }
        return count;
    }


    public boolean isCompleted() {
        return this.countCompletedTasks() == tasks.length;
    }

}
