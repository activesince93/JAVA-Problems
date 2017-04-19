package Random;

public class CircularLinkedListTest {
	public static void main(String args[]) {
		int position;
		CircularLinkedList circularLinkedList = new CircularLinkedList();
		circularLinkedList.addToFirst("3");
		circularLinkedList.addToFirst("2");
		circularLinkedList.addToFirst("1");
		circularLinkedList.addToLast("4");
		circularLinkedList.addToLast("7");
		circularLinkedList.add("5", 5);
		circularLinkedList.add("6", 6);
		
		System.out.println("Circular LinkedList: " + circularLinkedList);
		System.out.println("Circular LinkedList length: " + circularLinkedList.length());
		position = 4;
		circularLinkedList.remove(position);
		System.out.println("========= After removing node no. " + position + " ===========");
		System.out.println("Circular LinkedList: " + circularLinkedList);
		System.out.println("Circular LinkedList length: " + circularLinkedList.length());
		circularLinkedList.removeFirst();
		System.out.println("========= After removing FIRST node ===========");
		System.out.println("Circular LinkedList: " + circularLinkedList);
		System.out.println("Circular LinkedList length: " + circularLinkedList.length());
		circularLinkedList.removeLast();
		System.out.println("========= After removing LAST node ===========");
		System.out.println("Circular LinkedList: " + circularLinkedList);
		System.out.println("Circular LinkedList length: " + circularLinkedList.length());
		position = 4;
		System.out.println("Node at position "+position+" is: " + circularLinkedList.get(position));
	}
}

class CircularLinkedList {
	CircularLinkedListItems head;
	int itemsCount;
	
	public CircularLinkedList() {
		head = new CircularLinkedListItems(null);
		itemsCount = 0;
	}
	
	// Add first node
	public void addToFirst(Object data) {
		CircularLinkedListItems newNode = new CircularLinkedListItems(data);
		CircularLinkedListItems current = head;
		if(current.getNext() != null) {
			newNode.setNext(current);
			for(int i = 1; i < itemsCount; i++) {
				current = current.getNext();
			}
			current.setNext(newNode);
		} else {
			newNode.setNext(newNode);
		}
		head = newNode;
		itemsCount++;
	}
	
	// Add last node
	public void addToLast(Object data) {
		CircularLinkedListItems current = head;
		CircularLinkedListItems newNode = new CircularLinkedListItems(data);
		
		for(int i = 1; i < itemsCount; i++) {
			current = current.getNext();
		}
		current.setNext(newNode);
		newNode.setNext(head);
		itemsCount++;
	}
	
	// Add n-th node
	public void add(Object data, int index) {
		if(index > 1 && index <= itemsCount) {
			CircularLinkedListItems current = head;
			CircularLinkedListItems newNode = new CircularLinkedListItems(data);

			for(int i = 2; i < index; i++) {
				current = current.getNext();
			}
			newNode.setNext(current.getNext());
			current.setNext(newNode);
			itemsCount++;
		}
	}
	
	// Remove first node
	public void removeFirst() {
		CircularLinkedListItems current = head;
		head = current.getNext();
		for(int i = 1; i < itemsCount; i++) {
			current = current.getNext();
		}
		current.setNext(head);
		itemsCount--;
	}
	
	// Remove last node
	public void removeLast() {
		CircularLinkedListItems current = head;
		for(int i = 2; i < itemsCount; i++) {
			current = current.getNext();
		}
		current.setNext(head);
		itemsCount--;
	}
	
	// Remove n-th node
	public void remove(int index) {
		if(index > 1 && index < itemsCount) {
			CircularLinkedListItems current = head;
			for(int i = 2; i < index; i++) {
				current = current.getNext();
			}
			current.setNext(current.getNext().getNext());
			itemsCount--;
		}
	}
	
	// Get n-th node
	public Object get(int index) {
		if(index > 0 && index < itemsCount+1) {
			CircularLinkedListItems current = head;
			for(int i = 1; i < index; i++) {
				current = current.getNext();
			}
			return current.getData();
		}
		return "Error!";
	}
	
	@Override
	public String toString() {
		CircularLinkedListItems current = head;
		String output = "";
		for(int i = 0; i < itemsCount; i++) {
			output += "[" + current.getData().toString() + "]";
			current = current.getNext();
		}
		return output;
	}
	
	// Get length
	public int length() {
		return itemsCount;
	}
}

class CircularLinkedListItems {
	Object data;
	CircularLinkedListItems next;
	
	public CircularLinkedListItems(Object data) {
		this.data = data;
		next = null;
	}
	
	public CircularLinkedListItems(Object data, CircularLinkedListItems next) {
		this.data = data;
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public CircularLinkedListItems getNext() {
		return next;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public void setNext(CircularLinkedListItems next) {
		this.next = next;
	}
}

/*Output:
Circular LinkedList: [1][2][3][4][5][6][7]
Circular LinkedList length: 7
========= After removing node no. 4 ===========
Circular LinkedList: [1][2][3][5][6][7]
Circular LinkedList length: 6
========= After removing FIRST node ===========
Circular LinkedList: [2][3][5][6][7]
Circular LinkedList length: 5
========= After removing LAST node ===========
Circular LinkedList: [2][3][5][6]
Circular LinkedList length: 4
Node at position 4 is: 6*/