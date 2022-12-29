import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2,6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr){

        // making a swapped variable to check if swapping occurs in the first iteration because if the swapping doesn't occur, that means the passed array is already sorted
        boolean swapped = false;

        // setting a counter variable i which represents the total no. of elements in the array
        for(int i = 0;i<arr.length;i++){
            // inner loop j where the j keep tracks of the elements to be compared and swapped. It starts from 1 as we compare the current element at j with the previous one and if the current one is small, we swap those values
            /*
            for(int j = 1;j<arr.length;j++){
                if(arr[j]<arr[j-1]){
                    // swapping the elements
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            */

            // we can also enhance the inner loop further by only having to check for the remaining array and not the ones already sorted. Already sorted values end up on the right side
            for(int j = 1;j < arr.length-1;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    // make the swapped true as we have entered the swapping condition
                    swapped = true;
                }
            }

            // if the swap is not occurring, we break out of the loop
            if(!swapped){
                break;
            }
        }
    }
}
