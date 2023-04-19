package problems;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6,7,9,11};
        int ceilingIndex = ceilingNumber(nums,2);
        int ceiling = nums[ceilingIndex];
        System.out.printf("The ceiling of the number is %d at index %d",ceiling,ceilingIndex);

    }

    static int ceilingNumber(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start) / 2;
            if(target > arr[mid]){
                start = mid+1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
