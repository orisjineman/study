import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> stackList;

    public Stack() {
        this.stackList = new ArrayList<>();
    }

    // 스택에 요소 추가 (푸쉬)
    public void push(T item) {
        stackList.add(item);
    }

    // 스택에 요소 제거 (팝)
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return stackList.remove(size() - 1);
    }

    // 스택의 꼭대기 요소 확인 (피크)
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return stackList.get(size() - 1);
    }

    // 스택이 비어 있는지 확인
    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    // 스택의 크기 반환
    public int size() {
        return stackList.size();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack size: " + stack.size());
    }
}