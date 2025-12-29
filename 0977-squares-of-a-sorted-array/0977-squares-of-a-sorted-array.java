class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sqr =new int[nums.length];
        int j=0;
        for (int i:nums){
           sqr[j]=i*i;
           j++; 
        }
        Arrays.sort(sqr);
        return sqr;
    }
}