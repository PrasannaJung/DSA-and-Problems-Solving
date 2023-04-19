public class MinElement {
    public static void main(String[] args) {
        int[] arr = {2,1,4,-2,7};
        int minValue = arr[getMinIndex(arr)];
        System.out.println("The smallest element is "+minValue);

    }

     static int getMinIndex(int[] arr) {
        int minIndex = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < arr[minIndex] ){
                minIndex = i;
            }
        }
        return minIndex;
    }
}
