class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int size=nums.length;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(map.get(nums[i])==(size/2)){
                    return nums[i];
                }
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return size>0?nums[0]:-1;
    }
}