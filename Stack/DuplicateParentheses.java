import java.util.*;

public class DuplicateParentheses { // - Microsoft, Google
    /*
     * Given a balanced expression , find if it contains duplicate parentheses or
     * not. A set of
     * parentheses are duplicate if the same subexpression is surrounded by multiple
     * parentheses.
     * 
     * Return true if it contains duplicate else return false.
     * 
     * Example -
     * (((a+cb))) + (c+d) true
     * (((((a)+(b))+ c+d)) true
     * ((a+b)+(c+d)) false
     * (((a+b))+c) true
     */
    public static void main(String[] args) {
        String str = "(((a+cb))) + (c+d)"; // true
        String str2 = "((a+b)+(c+d))"; // false

        System.out.println(isValid(str));
        System.out.println(isValid(str2));
    }

    public static boolean isValid(String str) {
        Stack <Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            
            if(ch == ')'){ // closing parentheses
            int count = 0;
            while(s.pop() != '('){
                count++;
            }
            if (count < 1) {
                return true; // duplicate
            }
            }else{ // opening
                s.push(ch);
            }
        }
        return false;
    }
}
