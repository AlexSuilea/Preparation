package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyStack {
    Deque<Integer> deque;
    public MyStack() {
        this.deque = new ArrayDeque<>();
    }

    public void push(int x) {
        this.deque.addLast(x);
    }

    public boolean empty() {
        return this.deque.isEmpty();
    }

    public int pop() {
        int size = this.deque.size();
        for (int i = 0; i < size - 1; i++) {
            this.push(this.deque.pollFirst());
        }
        return this.deque.pollFirst();
    }

    public int top() {
        int size = this.deque.size();

        for (int i = 0; i < size-1; i++) {
            this.push(this.deque.pollFirst());
        }
        int res = this.deque.peekFirst();
        this.push(this.deque.pollFirst());

        return res;
    }
}
