public class StackOverflow {
    public static void printDec(int n) {
        // here we maded a comment of base case to obtain stack overflow 
        // if (n == 1) {
        //     System.out.print(n);
        //     return;
        // }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void main(String[] args) {
        /*
         * When there is no base case for recursion then function call will
         * never stop & cause of it out stack will filled up after some
         * time and we will reached to the condition stack overflow which
         * is an error & we will not get anything in our window.
         */
        int n = 10;
        printDec(n);

    }
}
