package PriorityQueue;

public class INTPQueue implements PQueue {
	
	Task head = new Task();

	@Override
	public void enter(Task Aufgabe) {
		
		// Aufgabe = new Task();
		
		if(Aufgabe.getPriority() == 3) {
			head.setNext(Aufgabe);
			Aufgabe.setPrev(head);
		}
		else if (Aufgabe.getPriority() == 2 && head.getNext().getPriority() >= 2 && head.getNext() != null) {
			Task sec_next = head.getNext();
			sec_next.setNext(Aufgabe);
			Aufgabe.setPrev(sec_next);
			
		}
		else if(Aufgabe.getPriority() == 1 && head.getNext() != null) {
			Task sec_next = head.getNext();
			Task third_next = sec_next.getNext();
			third_next.setNext(Aufgabe);
			Aufgabe.setPrev(third_next);
		}
		
		else {
			
			head.setNext(Aufgabe);
			Aufgabe.setPrev(head);
			
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

}
