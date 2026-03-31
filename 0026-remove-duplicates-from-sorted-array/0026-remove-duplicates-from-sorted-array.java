class Solution {
    public int removeDuplicates(int[] nums) {
       int i=0;
       for(int z=1;z<nums.length;z++){
        if(nums[z]>nums[i]){
            nums[i+1]=nums[z];
            i++;
        }
       }
       return i+1;
    }
}