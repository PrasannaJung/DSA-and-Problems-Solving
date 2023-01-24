public class LinearSearch{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 15;
        int result = linearSearch(arr,target);
        if(result != -1){
            System.out.println("The target element has been found at index: "+result);
        }else{
            System.out.println("The target element is not in the array");
        }
    }

    static int linearSearch(int[] arr,int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == n){
                return i;
            }
        }
        return -1;
    }
}