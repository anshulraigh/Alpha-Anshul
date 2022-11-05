public class FriendsPairing {
    public static void main(String[] args) {
        /*
         * Given n friends , each one can remain single or can be paired up with some
         * other friend. each friend can be paired only once. find out the total
         * number of ways in which friends can remain single or can be paired up
         * 
         * 
         */
        System.out.println(friendsPairing(3));
    }

    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        // // choise
        // // single
        // int fnm1 = friendsPairing(n - 1);
        // // pair
        // int fnm2 = friendsPairing(n - 2);
        // int pairWays = (n - 1) * fnm2;

        // // total ways
        // int totWays = fnm1 + pairWays;
        // return totWays;
        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }
}
