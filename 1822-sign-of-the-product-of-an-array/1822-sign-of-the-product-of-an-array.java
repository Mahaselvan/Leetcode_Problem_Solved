class Solution {
    public int arraySign(int[] nums) {
       double product=1;
        for (int i:nums){
            product*=i;
        }
        if(product<0){
            return -1;
        }
        if(product>0){
            return 1;
        }
        if(product==0){
            return 0;
        }
        return 0;
    }
}