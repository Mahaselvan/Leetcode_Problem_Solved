class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int len = (nums.length)*2;
      int arr[]= new int[len];
int k=0;
     for (int i=0;i<nums.length;i++){
        arr[k++]=nums[i];
     }
     for (int i=0;i<nums.length;i++){
        arr[k++]=nums[i];
     }
     
      return arr;


    }
}