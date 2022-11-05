public class Recursion {
    public static void printDec(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }
    public static void main(String[] args){
        /* Recursion is a method of solving a computational problem 
           where the solution deprnds on solution to smaller instances
           of the same problem */
    // print numbers from n to 1 (Decreasing order)
    // eg. n = 10 then print 10 9 8 7 6 5 4 3 2 1
    int n = 10;
    printDec(n);
    }

}