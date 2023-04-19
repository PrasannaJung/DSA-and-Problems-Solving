public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {1,7,3,4,5};
        int maxValue = arr[getMaxIndex(arr)];
        System.out.println("The max value is "+ maxValue);
    }

    static int getMaxIndex(int[] arr){
        int maxIndex = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
