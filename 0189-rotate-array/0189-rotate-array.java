class Solution {
    void reverse(int[]arr,int l,int r){
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
    public void rotate(int[] nums, int k) {
       int n=nums.length;
      k=k%n;
      reverse(nums,0,n-1);
      reverse(nums,0,k-1);
      reverse(nums,k,n-1);
}
}