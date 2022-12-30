import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {6,1,4,3,2,5};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

     static void insertionSort(int[] arr) {
        // defining the counter i for the no. of iterations
        // we only wanna run the array until the second last index
         for (int i = 0; i < arr.length - 1; i++) {
             // defining the inner loop j starting from i + 1 and sorting it with the left hand side of the selected index
             for(int j = i+1 ; j > 0;j--){
                 if(arr[j]<arr[j-1]){
                     int temp = arr[j-1];
                     arr[j-1] = arr[j];
                     arr[j] = temp;
                 }else{
                     break;
                 }
             }
         }
    }
}
