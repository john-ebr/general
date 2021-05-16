package PriorityQueue;

public class INTPQueue implements PQueue {
	
	private Task head = null;

	@Override
	public void enter(Task Aufgabe) {
		
		Aufgabe = new Task(0, null, null, 0, null, null);
		
		if(Aufgabe.getPriority() == 3) {
			head.setNext(Aufgabe);
		}
		else if (Aufgabe.getPriority() == 2) {
			Task sec_next = head.getNext();
			sec_next.setNext(Aufgabe);
			
		}
		else if(Aufgabe.getPriority() == 1) {
			Task sec_next = head.getNext();
			Task third_next = sec_next.getNext();
			third_next.setNext(Aufgabe);
		}
		
	}

	@Override
	public Task leave() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Task front() {
		// TODO Auto-generated method stub
		return null;
	}

}
