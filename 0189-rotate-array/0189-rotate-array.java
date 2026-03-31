class Solution {
    public void rotate(int[] nums, int k) {
        int size=nums.length;
        k=k%size;
        int temp[] = new int[k];
        int j=0;
        for(int i=size-k;i<size;i++){
            temp[j++]=nums[i];
        }
        for(int i=size-k-1;i>=0;i--){
              nums[i+k]=nums[i];
        }
        for(int i=0;i<k;i++){
            nums[i]=temp[i];
        }
    }
}