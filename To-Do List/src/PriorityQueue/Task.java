package PriorityQueue;

public class Task {

	int id;
	String name;
	String content;
	int priority;
	Task next;
	Task prev;

	public Task(int i, String n, String c, int p, Task x, Task y) {

		id = i;
		name = n;
		content = c;
		priority = p;
		next = x;
		prev = y;

	}

	public Task() {
		
		id = 0;
		name = null;
		content = null;
		priority = 0;
		next = null;
		prev = null;
		
	}

	public void setId(int i) {

		id = i;

	}

	public void setPriority(int p) {

		priority = p;

	}

	public void setContent(String c) {

		content = c;

	}

	public void setName(String n) {

		name = n;

	}
	
	public void setNext(Task n) {
		
		next = n;
		
	}
	
	public void setPrev(Task p) {
		
		prev = p;
		
	}

	public int getID() {

		return id;

	}

	public int getPriority() {

		return priority;

	}

	public String getContent() {

		return content;

	}

	public String getName() {

		return name;

	}
	
	public Task getNext() {
		
		return next;
		
	}
	
	public Task getPrev() {
		
		return prev;
		
	}

}
