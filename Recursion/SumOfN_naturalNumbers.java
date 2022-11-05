public class SumOfN_naturalNumbers {
        public static int sumOfn(int n){
            if(n == 1){
                return 1;
            }
            int sOn = n + sumOfn(n-1);
            return sOn;
        }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfn(n));
    }
}
