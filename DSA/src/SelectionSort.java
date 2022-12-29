import java.util.*;

class SelectionSort {
    public static void main(String[] args){

        int[] arr = {6,2,1,3,5,4};
        selectionSortUsingLargest(arr);
        System.out.println("SELECTION SORT USING THE LARGEST: ");
        System.out.println(Arrays.toString(arr));

        
    }

    // selecting the largest number and sorting
    static void selectionSortUsingLargest(int[] arr){
        // the logic here is to select either the smallest or the largest number and put it at its correct index
        // creating a counter variable "i" to iterate through the entire array
        for (int i = 0; i<arr.length; i++) {

            // finding the last index of the remaining array and as the iteration changes the last index in the remaining array also changes because the largest ones will be sorted to the last indices upon each iteration
            int lastIndex = arr.length-i-1;

            // finding the max index of the remaining array
            // as we are using the largest element, the start will always be constant
            int maxIndex = findMaxIndex(arr,0,lastIndex);

            // swapping the last index with the maximum index found int the remaining array
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[lastIndex];
            arr[lastIndex] = temp;

        }
    }

    static int findMaxIndex(int[] arr,int start,int end){
        int max = start;
        for (int i = start; i<= end;i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }


}