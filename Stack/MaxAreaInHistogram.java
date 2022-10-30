import java.util.*;
public class MaxAreaInHistogram { // Microsoft , Paytm Facebook

    /* Given an array of integers height representing the histogram's bar height where the 
    width of eacg bar is 1 , return the area of the largest rectangle in the histogram.
    
    Heights = [2,1,5,6,2,3]*/
    public static void main(String[] args) {
        int arr [] = {2,1,5,6,2,3}; // height's of histogram
        maxArea(arr);
    }

    public static void maxArea(int[] arr) {
        int maxArea = 0;
        int nsr[] = new int [arr.length];
        int nsl[] = new int [arr.length];

        // next smaller right
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length-1; i >=0 ; i--) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // next samaller left 
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // current Area = height * width (nsr[i] - nsl[i] - 1)
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] -1;
            int currArea = height*width;
            maxArea = Math.max(maxArea, currArea);
        }
        System.out.println("Max area in histogram = " + maxArea);
    }
}
