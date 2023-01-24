public class BinarySearch {

  public static void main(String[] args) {
    int[] arr = { 5, 6, 7, 8, 9, 10, 11, 12, 13 };
    int target = 12;
    int result = binarySearch(arr, target);
    if (result != -1) {
      System.out.println(
        "The target element has been found at index: " + result
      );
    } else {
      System.out.println("The target element is not in the array");
    }
  }

  static int binarySearch(int[] arr, int n) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      /*int mid = (start+end)/2 ;
       * */// this won't always work as the sum of the start and end index might exceed the limit that the integer data type can hold
      int mid = start + (end - start) / 2; // mathematically: 2*start+end-start / 2
      if (n == arr[mid]) {
        return mid;
      }
      if (n < arr[mid]) {
        end = mid - 1;
      } else if (n > arr[mid]) {
        start = mid + 1;
      }
    }
    return -1;
  }
}
