class Solution {
    public int[] numberGame(int[] nums) {
        int num1[] =new int[nums.length];
        Arrays.sort(nums);
        int index=0;
for (int i=0;i<=nums.length-1;i+=2){
num1[index++]=nums[i+1];
num1[index++]=nums[i];
}
return num1;
    }
}