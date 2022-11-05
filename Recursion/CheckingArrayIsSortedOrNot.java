public class CheckingArrayIsSortedOrNot {
    public static void main(String[] args) {
        // int arr[] = new int [5];
        int arr[]= {1,2,3,4,5}; // true
        // int arr[]= {1,2,3,1,5}; // false
        int i = 0;
        System.out.println(isSorted(arr,i));
    }
    public static boolean isSorted(int arr[],int i){
        if (i == arr.length-1) {
            return true;
        }
        if (arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }
}
