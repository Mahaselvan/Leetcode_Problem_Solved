class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pi=0,ni=1;
        int arr[]= new int[nums.length];
        for(int i : nums){
            if(i>=0){
                arr[pi]=i;
                pi+=2;
            }
            else{
                arr[ni]=i;
                ni+=2;
            }

        }
        return arr;
    }
}