package PriorityQueue;

public class App {

	Test te = new Test();

	public void addTask(String c, int p, int i, String n) {
		
		Task t = new Task(i, n, c, p, null, null);
		
		te.enter(t);
		
		if(t.getPriority() == 3) {

		}
		
		

	}
	
	public Task removeTask() {
		
		
		return null;
		
	}

	public static void main(String[] args) {
		
		App a = new App();

		a.addTask("Joggen gehen ", 3 , 1 , "Laufen ");
		a.addTask("aufräumen", 2, 2, "Aufräumen");
		
		
	}

}
