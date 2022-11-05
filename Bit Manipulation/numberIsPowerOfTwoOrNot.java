public class numberIsPowerOfTwoOrNot {
    public static boolean isPowerOfTwo(int n){
        return (n & n-1)==0;
    }
    public static void main(String[] args) {
        /*
         * Check if a number is a power of 2 or not
         * 4-->2^2    
         * 8-->2^3
         * 7-->2^X
         * Approach-->  4 -->    100
         *              3 -->  & 011 (& of 3 and 4 is 0)
         *              8 -->   1000
         *              7 --> & 0111  (& of 7 and 8 is 0)
         *              16 -->   1000 
         *              15 --> & 0111 (& of 15 and 16 is 0)
         *  so formula is (n & n-1) = 0 , then n is our answer like 4,8,16
         */
        //Code
        System.out.println(isPowerOfTwo(16)); // true
        System.out.println(isPowerOfTwo(15)); // false
    }
}
