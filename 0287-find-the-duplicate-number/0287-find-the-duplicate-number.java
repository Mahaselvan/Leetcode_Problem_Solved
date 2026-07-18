class Solution {
    public int findDuplicate(int[] nums) {
       int freq[]= new int[100001];
       for(int num : nums){
        freq[num]++;
        if(freq[num]==2){
            return num;
        }
       }
       return -1;
    }
}