public class Check_num_OddOrEven {
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask)==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        /*
         * Check if number is odd or even
         * 0 = 000    
         * 1 = 001      odd            even
         * 2 = 010       |               |
         * 3 = 011      LSB -- > 1      LSB --> 0 (LSB : least SIgnificant bit, last bit from left ,First bit from right)
         * 4 = 100      to make all bits 0 before LSB, do & with 1
         * 5 = 101
         */
        //Code
        oddOrEven(3);  // odd number
        oddOrEven(11); // odd number 
        oddOrEven(14); // even number
    }
}
