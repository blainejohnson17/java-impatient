package ch02.ex16;

public class QueueDemo {

	public static void main(String[] args) {
		Queue queue = new Queue();

		queue.add("foo");
		queue.add("bar");

		System.out.println(queue.remove());
		System.out.println(queue.remove());

		queue.add("baz");
		queue.add("bat");

		System.out.println(queue.remove());
		System.out.println(queue.remove());
	}

}
