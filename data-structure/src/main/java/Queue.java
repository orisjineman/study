import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> queueList;

    // FIFO
    public Queue() {
        this.queueList = new LinkedList<>();
    }

    // 큐에 요소 추가 (인큐)
    public void enqueue(T item) {
        queueList.addLast(item);
    }

    // 큐에서 요소 제거 (디큐)
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queueList.removeFirst();
    }

    // 큐의 앞쪽 요소 확인 (피크)
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queueList.getFirst();
    }

    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    public int size() {
        return queueList.size();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Front element: " + queue.peek());
        System.out.println("Queue size: " + queue.size());

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Queue size: " + queue.size());
    }
}
