class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int a:nums){
            if(hs.contains(a)){
                return a;
            }
            hs.add(a);
        }
        return -1;
    }
}