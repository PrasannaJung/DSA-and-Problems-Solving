package problems;

import java.util.Arrays;

public class FirstAndLastPosition {

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,3,3,5,6,7};
        int[] positions = getPositions(nums,3);
        System.out.println(Arrays.toString(positions));
    }

    static int[] getPositions(int[] nums,int target) {
        int[] ans = new int[]{-1,-1};
//        int firstIndex = firstIndexSearch(nums,target);
//        int lastIndex = lastIndexSearch(nums,target);
        int firstIndex = occurrenceSearch(nums,target,true);
        int lastIndex = occurrenceSearch(nums,target,false);
        ans[0] = firstIndex;
        ans[1] = lastIndex;
        return ans;
    }

     static int firstIndexSearch(int[] nums, int target) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1 ;
        while(start <= end ){
            int mid = start + (end-start) / 2;
            if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else {
                ans = mid;
                // because we are searching on the left for 1st occurrence
                // given that the array is in ascending order
                end = mid - 1;
            }
        }
        return ans;
    }

     static int lastIndexSearch(int[] nums, int target) {
         int ans = -1;
         int start = 0;
         int end = nums.length - 1 ;
         while(start <= end ){
             int mid = start + (end-start) / 2;
             if(target < nums[mid]){
                 end = mid - 1;
             }else if(target > nums[mid]){
                 start = mid + 1;
             }else {
                 ans = mid;
                 // because we are searching on the right for last occurrence
                 // given that the array is in ascending order
                 start = mid + 1;
             }
         }
         return ans;
    }

     /*
     ******************************************
     *** WE CAN ALSO DO IT IN ONE FUNCTION USING AN EXTRA PARAM THAT SAYS WHETHER
     * WE ARE SEARCHING FOR FIRST OR LAST
      */
     static int occurrenceSearch(int[] nums, int target,boolean searchingForFirst) {
         int ans = -1;
         int start = 0;
         int end = nums.length - 1 ;
         while(start <= end ){
             int mid = start + (end-start) / 2;
             if(target < nums[mid]){
                 end = mid - 1;
             }else if(target > nums[mid]){
                 start = mid + 1;
             }else {
                 ans = mid;
                 if(searchingForFirst){
                     end = mid - 1;
                 }else{
                     start = mid + 1;
                 }
             }
         }
         return ans;
     }

}
