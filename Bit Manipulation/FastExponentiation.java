public class FastExponentiation {
    public static int fastExpo(int a,int n){
        int ans = 1;
        while (n > 0) {
            if ((n & 1)!=0) {
                ans = ans*a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
       /* <Google> <Amazon>
       a^n --> a.a.a.a until n --> O(n)
                                    |
                  we will reduce it to O(log base n)

           3^5 --> 3^101

           1     0     1
           |     |     |
        1*a^4   1*a^2  1*a^0 left me bit bdhegi to a ki power bhi pdhegi a = a^2
                 |
                  --> 0 aayga to 1 se multiply 1*a^2 yha nhi use krenge
    1.  a=3 , ans = 1
        ans = (1*3) = (1*a^0) = 3
        a = a^2 = 9

    2.  a=9 , ans = 3
        ans = (3) * 1 =(bit 0 hone ki wjh se 1 se *) = 3
        a = a^2 = 81

    3.  a=81 , ans = 3
        ans = 3 * 81 = 1*(a^4) = 243
        a = a^2 = 81^2
        ans = 243 

        log base 2 of n --> log base 2 of 5 = 2 + 1 = 3 (isliye 3 iteration lgi)

       */ 
      //Code 
      System.out.println(fastExpo(3,5)); // 243
      System.out.println(fastExpo(5,3)); // 125
    }
}
