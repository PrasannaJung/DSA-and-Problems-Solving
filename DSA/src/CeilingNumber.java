public class CeilingNumber {
    // ceiling of a number is the smallest number present which is greater than the target element or equal to the target element
    public static void main(String[] args) {
        int[] arr = {5,7,9,11,12,13,14,15};
        int target = 12;
        int result = findCeiling(arr,target);
        System.out.println("The ceiling number has been found at index: "+result);

    }

    static int findCeiling(int[] arr ,int n){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(n < arr[mid]){
                end = mid - 1;
            }else if(n>arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
