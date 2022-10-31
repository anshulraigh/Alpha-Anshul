import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainOfPairs {
    /*
     * You are given n pairs of number , in every pair the first number is always smaller than the 
     * second  number. A pair (c,d) can came after pair (a,b) if b<c . find the longest chain which
     *  can be formed from given set of pairs.
     * 
     * eg. 
     * Pairs = (5,24) *
     *         (39,60)
     *         (5,28)
     *         (27,40) *
     *         (50,90) *
     * 
     * Answer = 3
     * 
     * approach will be same as Activity Selection
     */
    public static void main(String[] args) {
        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs , Comparator.comparingDouble(o->o[1]));

        int chainLen = 1;
        int chainEnd = pairs[0][1]; //last selected chain end 

        for (int i = 1; i < pairs.length; i++) {
            if(pairs[i][0] > chainEnd){
                chainEnd = pairs[i][1];
                chainLen++;
            }
        }
        System.out.println("max length of chain = "+ chainLen);
    }
}
