import java.util.*;

public class StackAndQueueUsingDeque {
    /*
     * Stack from Deque
     * push - > addLast()
     * pop - > removeLast()
     * peek - > getLast()
     */
    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        public boolean isEmpty() {
            return deque.isEmpty();
        }

        public void push(int data) {
            deque.addLast(data);
        }

        public int pop() {
            return deque.removeLast();
        }

        public int peek() {
            return deque.getLast();
        }
    }

    /*
     * Queue from Deque
     * add - > addLast();
     * remove -> removeFirst();
     * peek -> getFirst();
     */
    static class Queue {
        Deque<Integer> d = new LinkedList<>();

        public boolean isEmpty() {
            return d.isEmpty();
        }

        public void add(int data) {
            d.addLast(data);
        }

        public int remove() {
            return d.removeFirst();
        }

        public int peek() {
            return d.getFirst();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.pop();
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        
        System.out.println();

        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
