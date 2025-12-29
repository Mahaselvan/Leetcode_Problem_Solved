int removeElement(int* nums, int numsSize, int val) {
    int cnt=0;
 int i=0;
  for(int j=0;j<numsSize;j++){
    if(nums[j]!=val){
        cnt++;
        nums[i]=nums[j];
          i++;
    }
  }
  return cnt;
}