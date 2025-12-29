class Solution {
    public int searchInsert(int[] nums, int target) {
         int i=0;
         for (int j=0;j<=nums.length-1;j++){
            if(nums[j]<target){
                i++;
            }
         }
         return i;
    }
}