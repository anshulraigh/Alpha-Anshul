import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort {


    public static void printArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[] = { 5, 1, 4, 3, 2 };
        // Arrays.sort(arr); --> import java.util.Arrays;
        // printArr(arr);
        Arrays.sort(arr,0,3); // sorted till index 2
        printArr(arr);

        // to sort in decreasing 
        // write Integer in place of int in line 13 and 6
        // Arrays.sort(arr,Collections.reverseOrder());
        // printArr(arr);

        // to sort in decreasing in Range
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        printArr(arr);
    }
}
