package PriorityQueue;

public class App {

	Test te = new Test();

	public void addTask(String c, int p, int i, String n) {

		Task t = new Task(i, n, c, p, null, null);

		te.enter(t);
		
		
		
		
		
		
		if(te.front().getNext() == null) {
			System.out.println(te.front().getName());
		}
		else if(te.front().getNext().getNext() == null) {
			System.out.println(te.front().getName());
			System.out.println(te.front().getNext().getName());
		}
		else if(te.front().getNext().getNext().getNext() == null) {
			System.out.println(te.front().getName());
			System.out.println(te.front().getNext().getName());
			System.out.println(te.front().getNext().getNext().getName());
		}
		


		

	}

	public Task removeTask() {

		te.leave();
		
		return null;

	}

	public static void main(String[] args) {

		App a = new App();

		a.addTask("a ", 1, 1, "a");
		a.addTask("b", 2, 2, "b");
		a.addTask("c", 3, 3, "c");

	}

}
