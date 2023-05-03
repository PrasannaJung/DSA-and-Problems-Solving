package recursion;

public class IsSorted {
    public static void main(String[] args) {

        int[] arr = {5,2,3};
        boolean isSorted = isSorted(arr,0);
        System.out.println(isSorted);

    }

    public static boolean isSorted(int[] arr,int start){
        if(start == arr.length - 1){
            return true;
        }

        return arr[start] < arr[start+1] && isSorted(arr,start+1);
    }
}
