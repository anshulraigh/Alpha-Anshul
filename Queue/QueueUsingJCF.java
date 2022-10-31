import java.util.*;
public class QueueUsingJCF {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // or
        // Queue<Integer> q2 = new ArrayDeque<>(); 

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
