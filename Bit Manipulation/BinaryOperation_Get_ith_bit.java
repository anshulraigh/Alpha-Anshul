public class BinaryOperation_Get_ith_bit {
    public static int getIthBit(int  n,int i){
        int bitMask = 1<<i;
        if ((n & bitMask)==0) {
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        /*
         * i = 3
         * 10001001
         *     |||| 
         *     3210
         *     | we have 1 in ith position
         * to find 0th bit we do AND of number with 1
         * so, for finding ith bit we do AND of number with (1 << i)
         * do dry run in notebook for better understanding 😃
         * 
         * Approach
         * n & (1 << i) --> 0 then ans is also 0 , if not 0 then ans is 1
         */
        //Code
        System.out.println(getIthBit(10, 2)); // 0
    }
}
