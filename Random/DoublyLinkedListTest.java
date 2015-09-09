package Random;

public class DoublyLinkedListTest {
	public static void main(String args[]) {
		int position;
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.addToFirst("3");
		doublyLinkedList.addToFirst("2");
		doublyLinkedList.addToFirst("1");
		doublyLinkedList.addToLast("5");
		doublyLinkedList.add("4", 4);
		
		System.out.println("Doubly LinkedList: " + doublyLinkedList);
		System.out.println("Doubly LinkedList length: " + doublyLinkedList.length());
		position = 3;
		doublyLinkedList.remove(position);
		System.out.println("========= After removing node no. " + position + " ===========");
		System.out.println("Doubly LinkedList: " + doublyLinkedList);
		System.out.println("Doubly LinkedList length: " + doublyLinkedList.length());
		doublyLinkedList.removeFirst();
		System.out.println("========= After removing FIRST node ===========");
		System.out.println("Doubly LinkedList: " + doublyLinkedList);
		System.out.println("Doubly LinkedList length: " + doublyLinkedList.length());
		doublyLinkedList.removeLast();
		System.out.println("========= After removing LAST node ===========");
		System.out.println("Doubly LinkedList: " + doublyLinkedList);
		System.out.println("Doubly LinkedList length: " + doublyLinkedList.length());
		position = 2;
		System.out.println("Node at position "+ position +" is: " + doublyLinkedList.get(position));
	}
}

class DoublyLinkedList {
	DoublyLinkedListItems head;
	int itemsCount;
	
	public DoublyLinkedList() {
		head = new DoublyLinkedListItems(null);
		itemsCount = 0;
	}
	
	public void addToFirst(Object data) {
		DoublyLinkedListItems newHead = new DoublyLinkedListItems(data);
		if(head.getData() != null) {
			newHead.setNext(head);
			newHead.setPrev(null);
			head.setPrev(newHead);
		}
		head = newHead;
		itemsCount++;
	}
	
	public void addToLast(Object data) {
		DoublyLinkedListItems newNode = new DoublyLinkedListItems(data);
		DoublyLinkedListItems current = head;
		while(current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(newNode);
		newNode.setPrev(current);
		newNode.setNext(null);
		itemsCount++;
	}
	
	public void add(Object data, int index) {
		if(index > 1 && index <= itemsCount) {
			DoublyLinkedListItems current = head;
			DoublyLinkedListItems newNode = new DoublyLinkedListItems(data);
			for(int i = 2; i < index; i++) {
				current = current.getNext();
			}
			current.getNext().setPrev(newNode);
			newNode.setNext(current.getNext());
			current.setNext(newNode);
			newNode.setPrev(current);
			itemsCount++;
		}
	}
	
	public void removeFirst() {
		DoublyLinkedListItems current = head;
		if(current.getNext() != null) {
			current = current.getNext();
		}
		current.setPrev(null);
		head = current;
		itemsCount--;
	}
	
	public void removeLast() {
		DoublyLinkedListItems current = head;
		while(current.getNext().getNext() != null) {
			current = current.getNext();
		}
		current.setNext(null);
		itemsCount--;
	}
	
	public void remove(int index) {
		if(index > 1 && index < itemsCount) {
			DoublyLinkedListItems current = head;
			for(int i = 2; i <= index; i++) {
				current = current.getNext();
			}
			current.getPrev().setNext(current.getNext());
			current.getNext().setPrev(current.getPrev());
			itemsCount--;
		}
	}
	
	public Object get(int index) {
		if(index > 0 && index <= itemsCount) {
			DoublyLinkedListItems current = head;
			for(int i = 2; i <= index && current.getNext() != null; i++) {
				current = current.getNext();
			}
			return current.getData();
		}
		return "Error!";
	}
	
	public int length() {
		return itemsCount;
	}
	
	@Override
	public String toString() {
		
		DoublyLinkedListItems current = head;
		String output = "";
		while(current != null) {
			output += "[" + current.getData().toString() + "]";
			current = current.getNext();
		}
		return output;
	}
}

class DoublyLinkedListItems {
	Object data;
	DoublyLinkedListItems prev;
	DoublyLinkedListItems next;
	
	public DoublyLinkedListItems(Object data) {
		next = null;
		prev = null;
		this.data = data;
	}
	
	public DoublyLinkedListItems(Object data, DoublyLinkedListItems prev, DoublyLinkedListItems next) {
		this.data = data;
		this.next = next;
		this.prev = prev;
	}

	public Object getData() {
		return data;
	}

	public DoublyLinkedListItems getPrev() {
		return prev;
	}

	public DoublyLinkedListItems getNext() {
		return next;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public void setPrev(DoublyLinkedListItems prev) {
		this.prev = prev;
	}

	public void setNext(DoublyLinkedListItems next) {
		this.next = next;
	}
}


/*Output:
Doubly LinkedList: [1][2][3][4][5]
Doubly LinkedList length: 5
========= After removing node no. 3 ===========
Doubly LinkedList: [1][2][4][5]
Doubly LinkedList length: 4
========= After removing FIRST node ===========
Doubly LinkedList: [2][4][5]
Doubly LinkedList length: 3
========= After removing LAST node ===========
Doubly LinkedList: [2][4]
Doubly LinkedList length: 2
Node at position 2 is: 4*/