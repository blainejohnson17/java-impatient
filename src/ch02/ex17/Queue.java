package ch02.ex17;

public class Queue {
	private Node tail;
	private Node head;

	private static class Node {
		String value;
		private Node next;
	}

	public class Iterator {
		private Node current;

		private Iterator() {
			current = head;
		}

		public String next() {
			Node node = current;
			current = current.next;
			return node.value;
		}

		public boolean hasNext() {
			if (current == null) {
				return false;
			} else {
				return true;
			}
		}
	}

	public Iterator iterator() {
		return new Iterator();
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
