package PriorityQueue;

public class INTPQueue implements PQueue {

	Task head = new Task();

	@Override
	public void enter(Task Aufgabe) {

		if (head.getNext() == null) {

			head.setNext(Aufgabe);
			Aufgabe.setPrev(head);

		} else if (head.getNext() != null && Aufgabe.getPriority() == 3) {

			if (lastP3() != null) {

				Task i = lastP3();

				i.getNext().setPrev(Aufgabe);
				Aufgabe.setNext(i.getNext());
				i.setNext(Aufgabe);
				Aufgabe.setPrev(i);

			} else {
				
				head.getNext().setPrev(Aufgabe);
				Aufgabe.setNext(head.getNext());
				head.setNext(Aufgabe);
				Aufgabe.setPrev(head);

			}

		}else if (head.getNext() != null && Aufgabe.getPriority() == 2) {

			if (lastP2() != null) {

				Task i = lastP2();

				i.getNext().setPrev(Aufgabe);
				Aufgabe.setNext(i.getNext());
				i.setNext(Aufgabe);
				Aufgabe.setPrev(i);

			} else {
				
				head.getNext().setPrev(Aufgabe);
				Aufgabe.setNext(head.getNext());
				head.setNext(Aufgabe);
				Aufgabe.setPrev(head);

			}

		}else if (head.getNext() != null && Aufgabe.getPriority() == 1) {

			if (lastP1() != null) {

				Task i = lastP1();

				i.getNext().setPrev(Aufgabe);
				Aufgabe.setNext(i.getNext());
				i.setNext(Aufgabe);
				Aufgabe.setPrev(i);

			} else {
				
				head.getNext().setPrev(Aufgabe);
				Aufgabe.setNext(head.getNext());
				head.setNext(Aufgabe);
				Aufgabe.setPrev(head);

			}

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

		while(head.getNext() == null) {
			boolean i = true;
			return i;
		}
		
		return false;
		
	}

	@Override
	public Task front() {

		Task firstTask = head.getNext();
		return firstTask;

	}

	@Override
	public Task back() {

		Task i = head;

		while (i.getNext() != null) {

			i = i.getNext();
		}

		return i;
		
	}

	@Override
	public Task lastP3() {

		Task i = head;

		while (i.getNext() != null && i.getNext().getPriority() == 3) {

			i = i.getNext();

		}

		return i;

	}

	@Override
	public Task lastP2() {

		Task i = lastP3();

		while (i.getNext() != null && i.getNext().getPriority() == 2) {

			i = i.getNext();
		}

		return i;

	}

	@Override
	public Task lastP1() {

		Task i = lastP2();

		while (i.getNext() != null && i.getNext().getPriority() == 1) {

			i = i.getNext();

		}

		return i;

	}

}
