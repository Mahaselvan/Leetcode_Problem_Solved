class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digsum=0;
        for (int i=0;i<nums.length;i++){
                    sum+=nums[i];
        }
        for (int i=0;i<nums.length;i++){
            int num=nums[i];
            if(num>9){
                while(num>0){
               int rem=num%10;
                digsum+=rem;
                num=num/10;
            }}
            else{
                digsum+=nums[i];
            }
        }
        return Math.abs(digsum-sum);
        
    }
}