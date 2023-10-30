package LinearQueue;

public class LinearQueue {
	private static int front, rear, size;
	private static int[] queue;

	public LinearQueue(int size) {

		this.rear = -1;
		this.front = 0;
		this.size = size;
		queue = new int[size];
	}

	public static void Enqueue(int elem) {
		if (rear == size - 1) {
			System.out.println("Queue is full!!");
		} else {
			rear = rear + 1;
			queue[rear] = elem;
		}
	}

	public static int Dequeue() {
		if (rear == -1) {
			System.out.println("Queue is empty!!");
		}

		int elem = queue[front];
		for (int i = 0; i < rear; i++) {
			queue[i] = queue[i + 1];
			queue[i + 1] = 0;
		}
		rear--;
		return elem;
	}

	public static void main(String[] args) {
		// int size=5;
		LinearQueue q1 = new LinearQueue(7);
		q1.Enqueue(12);
		q1.Enqueue(15);
		q1.Enqueue(22);
		q1.Enqueue(30);
		q1.Enqueue(10);

		for (int i : queue) {
			System.out.println(i);
		}
		System.out.println("Element deleted ::" + q1.Dequeue());
		System.out.println("Element deleted ::" + q1.Dequeue());
		// System.out.println("Element deleted ::"+q1.Dequeue());

		for (int i : queue) {
			System.out.println("*" + i);
		}
		q1.Enqueue(8);
		q1.Enqueue(9);

		for (int i : queue) {
			System.out.println(i);
		}
	}

}

