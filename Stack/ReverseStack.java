import java.util.*;
public class ReverseStack {
    public static void pushAtBottom(Stack<Integer> s, int data){ //TC = O(n) , no extra space used
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){ 
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }
    public static void main(String[] args) {
        
    }
}
