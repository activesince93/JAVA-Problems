// Created by Darshan Parikh
public class SinglyLInkedListTest {
	public static void main(String args[]) {
		SimpleLinkedList simpleLinkedList = new SimpleLinkedList();
		simpleLinkedList.addToFirst("1");
		simpleLinkedList.addToLast("2");
		simpleLinkedList.addToLast("4");
		simpleLinkedList.addToLast("5");
		simpleLinkedList.add("3", 3);
		simpleLinkedList.addToFirst("0");
		simpleLinkedList.addToLast("7");
		simpleLinkedList.add("6", 7);
		
		System.out.println("Linkedlist: " + simpleLinkedList);
		System.out.println("Length: " + simpleLinkedList.length());
		simpleLinkedList.removeFirst();
		System.out.println("Linkedlist: " + simpleLinkedList);
		System.out.println("Length: " + simpleLinkedList.length());
		simpleLinkedList.removeLast();
		System.out.println("Linkedlist: " + simpleLinkedList);
		System.out.println("Length: " + simpleLinkedList.length());
		simpleLinkedList.remove(3);
		System.out.println("Linkedlist: " + simpleLinkedList);
		System.out.println("Length: " + simpleLinkedList.length());
		int position = 6;
		System.out.println("Node at position " + position + " is: " + simpleLinkedList.get(position));
	}
}

class SimpleLinkedList {
	LinkedListItems head;
	int itemsCount;
	
	public SimpleLinkedList() {
		head = new LinkedListItems(null);
		itemsCount = 0;
	}
	
	// Add new node in begining in LinkedList
	public void addToFirst(Object data) {
		LinkedListItems newHead = new LinkedListItems(data);
		if(head.getData() != null) {
			newHead.setNext(head);
		}
		head = newHead;
		itemsCount++;
	}
	
	//Add new node at end in LinkedList
	public void addToLast(Object data) {
		LinkedListItems temp = new LinkedListItems(data);
		LinkedListItems current = head;
		while(current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(temp);
		itemsCount++;
	}
	
	//Add new node at desired position in LinkedList
	public void add(Object data, int index) {
		index = index - 2;
		if(index >= 0) {
			LinkedListItems newNode = new LinkedListItems(data);
			LinkedListItems current = head;
			for(int i = 0; i < index && current.getNext().getData() != null; i++) {
				current = current.getNext();
			}
			newNode.setNext(current.getNext());
			current.setNext(newNode);
			itemsCount++;
		}
	}
	
	// Converting SimpleLinkedList to string
	public String toString() {
		LinkedListItems crunchifyCurrent = head;
        String output = "";
        while (crunchifyCurrent != null) {
            output += "[" + crunchifyCurrent.getData().toString() + "]";
            crunchifyCurrent = crunchifyCurrent.getNext();
        }
        return output;
    }
	
	// Return length of LinkedList
	public int length() {
		return itemsCount;
	}
	
	// Remove first node in LinkedList
	public void removeFirst() {
		head = head.getNext();
		itemsCount --;
	}
	
	// Remove last node in LinkedList
	public void removeLast() {
		LinkedListItems current = head;
		while(current.getNext().getNext() != null) {
			current = current.getNext();
		}
		current.setNext(null);
		itemsCount --;
	}
	
	// Remove node from position in LinkedList
	public void remove(int index) {
		if(index > 1 && index < itemsCount+1) {
			LinkedListItems current = head;
			for(int i = 2; i < index; i++) {
				current = current.getNext();
			}
			current.setNext(current.getNext().getNext());
			itemsCount--;
		}
	}
	
	// Get node from position in LinkedList
	public Object get(int index) {
		if(index <= itemsCount) {
			LinkedListItems current = head;
			for(int i = 1; i < index; i++) {
				current = current.getNext();
			}
			return current.getData();
		}
		return "Error!";
	}
}

class LinkedListItems {
	
	Object data;
	LinkedListItems next;
	
	LinkedListItems(Object data) {
		this.data = data;
	}
	
	LinkedListItems(Object data, LinkedListItems next) {
		this.data = data;
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public LinkedListItems getNext() {
		return next;
	}

	public void setNext(LinkedListItems next) {
		this.next = next;
	}
}