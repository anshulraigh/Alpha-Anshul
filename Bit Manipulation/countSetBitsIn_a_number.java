public class countSetBitsIn_a_number {
    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){ // check your LSB
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        /*
         * count set bits in a number 
         * 10 --> 1 0 1 0 --> here no. of set-bit(1) is 2
         *        -   -
         * odd and even --> &(1 << 0)
         * 1.  n = 1010   count = 0 , LSB = 0
         *     n >> 1
         * 2.  n = 0101   count = 1 , LSB = 1
         *     n >> 1
         * 3.  n = 0010   count = 1 , LSB = 0
         *     n >> 1
         * 4.  n = 0001   count = 2 , LSB = 1
         *     n >> 1
         * 5.  n = 0000   count = 2 , LSB = 0
         *     here n = 0 so iteration stops here and count = 2
         * 
         * to count number of bit a number can have = (log of number with base 2 )+1
         *                                          = (log of 16 with base 2 )+1 = 4 + 1 = 5
         * so , 16 can be define in 5 bits = 10000
         */
        //Code
        System.out.println(countSetBits(10)); // 2
    }
}
