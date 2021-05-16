package PriorityQueue;


public interface PQueue {

	public void enter(Task Aufgabe);
	// enters new Task

	public Task leave();
	// deletes the oldest Object with the highest priority and returns it

	public boolean isEmpty();
	// checks if the Queue is empty

	public Task front();
	// returns the oldest Object with the highest priority
	
	public Task back();
	// returns the newest Object with the lowest Priority
	
	
}
