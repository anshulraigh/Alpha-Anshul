import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    /*
     * We are given an infinite supply of denominations [1,2,5,10,20,50,100,500,2000]. Find 
     * minimum no. of coins/notes to make change for a value V.
     * 
     * V = 121
     * answer = 3 (100+20+1)
     * 
     * V = 590
     * answer = 4 (500+50+20+20)
     */
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins, Comparator.reverseOrder()); //sort in descending

        int countOfCoins = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if(coins[i] <= amount){
                while (coins[i]<=amount) {
                countOfCoins++;
                ans.add(coins[i]);
                amount -= coins[i];
                }
            }
        }
        System.out.println("total min coins used = "+ countOfCoins);
        System.out.println(ans);
    }
}
