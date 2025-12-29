class Solution {
    public static int search(int[] nums,int low,int high,int target,int searchno){
        int index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){        
                    index=mid;
                    if(searchno==1){
                    high=mid-1;
                    }
                    else{
                        low=mid+1;
                    }
            }   
          else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return index;
    }
    public int[] searchRange(int[] nums, int target) {
          int[] ans=new int[2];
        if(nums.length==0){
         ans[0]=-1;
         ans[1]=-1;
         return ans;
        }
        int first=search(nums,0,nums.length-1,target,1);
        int last=search(nums,0,nums.length-1,target,2);
        ans[0]=first;
        ans[1]=last;
        return ans;
    }
}