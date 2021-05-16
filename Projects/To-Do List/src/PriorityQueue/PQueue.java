package PriorityQueue;


public interface PQueue {

	public void enter(Task Aufgabe);
	// enters new Task

	public Task leave() throws PQueueEmptyExecption;
	// deletes the oldest Object with the highest priority and returns it

	public boolean isEmpty();
	// checks if the Queue is empty

	public Task front();
	// returns the oldest Object with the highest priority
	
	public Task back();
	// returns the newest Object with the lowest Priority
	
	public Task lastP3();
	// returns position of the last Task with the Prioirity 3
	
	public Task lastP2();
	// returns position of the last Task with the prioirity 2
	
	public Task lastP1();
	// returns position of the last Task with the prioirity 1
	
}
