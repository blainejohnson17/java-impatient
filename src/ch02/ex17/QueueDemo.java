package ch02.ex17;

public class QueueDemo {

	public static void main(String[] args) {
		Queue queue = new Queue();

		queue.add("foo");
		queue.add("bar");
		queue.add("baz");
		queue.add("bat");

		Queue.Iterator iterator = queue.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
