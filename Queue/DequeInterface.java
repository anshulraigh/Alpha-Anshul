import java.util.*;
public class DequeInterface {
    //Deque is Double ended Queue and Inteface in java
    /*
     * What is diff betweeen Deque & Dequeue
     * Deque - is double ended queue means element can be added or removeed from either the front or back.
     * Dequeue - means removal of element
     * Enqueue - addition of element
     * 
     * Operation in Deque
     * 1) addFirst()
     * 2) addLast()
     * 3) removeFirst()
     * 4) removeLast()
     * 5) getFirst() ---> peek()
     * 6) getLast()
     */
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1); //1
        deque.addLast(2); //1,2
        deque.addLast(3); //1,2,3
        deque.addLast(4); //1,2,3,4
        deque.removeLast(); //1,2,3
        System.out.println(deque.getFirst()); //1
        System.out.println(deque.getLast());  //3
        System.out.println(deque); //[1, 2, 3]
    }
}
