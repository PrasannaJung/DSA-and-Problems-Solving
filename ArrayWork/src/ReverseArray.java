import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,6};
        reverseArray(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void reverseArray(int[] arr){
        int mid = (arr.length-1) / 2;
        for(int i=0;i<=mid;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
}
