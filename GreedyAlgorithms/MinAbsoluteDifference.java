import java.util.Arrays;

public class MinAbsoluteDifference {
    /*
         * Given the arrays A and B of equal length n pair each element of array A to 
         * an element in array B , such that sum of absolute difference of all the pairs 
         * is minimum.
         * 
         * eg. 
         * A = [1,2,3]
         * B = [2,1,3]
         * 
         * Answer = 0
         * case 1: |1-2| + |2-1| + |3-3| = 1+1+0 = 2
         * case 2: |1-3| + |2-1| + |3-2| = 2+1+1 = 4
         * case 3: |1-1| + |2-2| + |3-3| = 0+0+0 = 2
         * 
         * Approach 
         * A = [4,1,8,7] --> sort [1,4,7,8]
         * B = [2,3,6,5] --> sort [2,3,5,6]
         * 
         * so our best case will be = |1-2| + |4-3| + |7-5| + |8-6| = 1+1+2+2 = 6
         */
    public static void main(String[] args) {
        int A[] = {1,4,7,8};
        int B[] = {2,3,5,6};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for (int i = 0; i < B.length; i++) {
            minDiff += Math.abs(A[i]-B[i]);
        }
        
        System.out.println("min absolute difference of pairs = "+ minDiff);
    }
}
