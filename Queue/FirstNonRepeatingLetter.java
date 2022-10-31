import java.util.*;
public class FirstNonRepeatingLetter { // [Flipkart]
    /* Q. First Non-repeating lrtter in stream of characters.

     * input -  a  a b c c x b
     * output - a -1 b b b b x
     * 
     * a              - a
     * a a            - -1
     * a a b          - b
     * a a b c        - b
     * a a b c c      - b
     * a a b c c x    - b
     * a a b c c x b  - x
     */
    public static void printRepeating(String str){
        int freq[] = new int[26]; // a-z
        Queue <Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            while (!q.isEmpty() && freq[q.peek()-'a']>1) {
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1 + " ");
            }else{
                System.out.print(q.peek()+" ");;
            }
        }
    }

    public static void main(String[] args) {
        String str = "aabccxb";
        printRepeating(str);
    }
}
