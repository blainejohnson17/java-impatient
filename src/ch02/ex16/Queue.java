package ch02.ex16;

public class Queue {
	Node tail;
	Node head;

	private static class Node {
		String value;
		private Node next;
	}

	public void add(String value) {
		Node newNode = new Node();
		newNode.value = value;
		if (head == null) {
			head = newNode;
		} else {
			tail.next = newNode;
		}
		tail = newNode;
	}

	public String remove() {
		String value = head.value;
		head = head.next;
		return value;
	}

}
