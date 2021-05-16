package PriorityQueue;

public class INTPQueue implements PQueue {
	
	Task head = new Task();

	@Override
	public void enter(Task Aufgabe) {
		
		if (head.getNext() == null) {
			
			head.setNext(Aufgabe);
			Aufgabe.setPrev(head);
			
		}
		else if (head.getNext() != null && Aufgabe.getPriority() == 3) {
			
			// gleiche prio oder höher?
			// einsortieren 
			// niedrigeren verknüpfen
			
		}
		
		
		
		

	}

	@Override
	public Task leave() {

		Task second_next = head.getNext();
		
		head.setNext(second_next.getNext());
		second_next.setPrev(head);
		
		return second_next;
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Task front() {

		Task firstTask = head.getNext();
		return firstTask;
		
	}

	@Override
	public Task back() {

		return null;
	}

	@Override
	public Task lastP3() {

		Task i = head;
		
		while(i.getNext() != null && i.getNext().getPriority() == 3 ) {
			
			i = i.getNext();
			
		}
		
		return i;
		
	}

	@Override
	public Task lastP2() {

		Task i = lastP3();
		
		while(i.getNext() != null && i.getNext().getPriority() == 2 ) {
			
			i = i.getNext();
		}
		
		return i;
		
	}

	@Override
	public Task lastP1() {

		Task i = lastP2();
		
		while(i.getNext() != null && i.getNext().getPriority() == 1) {
			
			i = i.getNext();
			
		}
		
		return i;
		
	}

}
