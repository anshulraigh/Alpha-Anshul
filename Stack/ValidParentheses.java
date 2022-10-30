import java.util.*;
public class ValidParentheses {
    //Given a string str containing just the characters '(' ')' ,'{' ,'}' , '[', ']' ,determine
    // if the input string is valid.

    /*
     * An input string is valid if :
     * 1) Open brackets must be closed by the same type of bracket
     * 2) Open brackets must be closed in the correct order
     * 3) Every close bracket has a corresponding open bracket of the same type.
     * 
     * Example - 
     *   Valid -- "(){}[]" , "()" , "({[]})"
     *   Invalid - "(]" , ")(" , "(((("
     */

    public static void main(String[] args) {
        String str = "{[()]}"; //true
        System.out.println(isValid(str));
    }

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                // opening parentheses
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                if(s.peek() == '(' && ch == ')' ||
                s.peek() == '{' && ch == '}' ||
                s.peek() == '[' && ch == ']'){
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        }else{
            return false;
        }

    }
}
