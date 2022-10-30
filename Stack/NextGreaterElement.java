import java.util.*;
public class NextGreaterElement {
    // the next gereater element of some element s in an array is the first greater element
    // that is to the right of x in the same array.
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        // 1 sol- Brute force --> nested loop --> TC = O(n^2)
        // 2 sol- Using Stack --> traverse from back --> TC = O(n)
        Stack<Integer> s = new Stack<>();
        int nextGenerator[] = new int[arr.length];

        for(int i = arr.length-1; i >= 0; i--){
            // 1 while 
            while(!s.isEmpty()&& arr[s.peek()] <= arr[i]){
                s.pop();
            }
            // 2 if-else
            if(s.isEmpty()){
                nextGenerator[i] = -1;
            }else{
                nextGenerator[i] = arr[s.peek()];
            }
            // 3 push in s
            s.push(i);
        }

        for (int i = 0; i < nextGenerator.length; i++) {
            System.out.print(nextGenerator[i] + " ");
        }
    }
}
