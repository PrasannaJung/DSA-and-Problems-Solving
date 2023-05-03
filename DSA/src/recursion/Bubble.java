package recursion;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        bubbleSort(arr,arr.length - 1 ,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr,int size,int el){
        if(size == 0){
            return;
        }
        if(el < size){
            int temp = arr[el];
            arr[el] = arr[el+1];
            arr[el+1] = temp;
            bubbleSort(arr,size,el+1);
        }else {
            bubbleSort(arr,size-1,0);
        }
    }
}
