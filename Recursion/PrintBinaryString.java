public class PrintBinaryString {
    public static void main(String[] args) {
        printBinString(3,0,"");
        // we can also set 1 as lastPlace.
    }
    public static void printBinString(int n,int lastPlace,String str){
        // base case
        if (n==0) {
            System.out.println(str);
            return;
        }
        //kaam
        printBinString(n-1, 0, str+"0");
        if (lastPlace==0) {
            printBinString(n-1, 1, str+"1");
        }
    }
}
