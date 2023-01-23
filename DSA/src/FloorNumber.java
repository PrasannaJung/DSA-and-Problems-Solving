public class FloorNumber {
    // floor of a number is the greatest number present which is less than the target element or equal to the target element
    public static void main(String[] args) {
        int[] arr = {5,7,9,11,12,13,14,15};
        int target = 16;
        int result = findFloor(arr,target);
        System.out.println("The floor number has been found at index: "+result);

    }

    static int findFloor(int[] arr ,int n){
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
        return end;
    }
}
