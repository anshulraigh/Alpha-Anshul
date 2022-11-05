public class PrintXkiPowerN {
    public static void main(String[] args) {
        System.out.println(power(2, 10)); //1024
        // getting wrong answer for x = 0
    }
    public static int power(int x,int n){
        if(n == 0){
            return 1;
        }
        return x * power(x, n-1);
    }
}
