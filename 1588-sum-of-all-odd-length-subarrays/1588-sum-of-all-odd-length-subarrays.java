class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int result = 0, temp = 0;

        for (int i = 0; i < n; i++) {

            temp = 0;
            for (int j = i; j < n; j++) {
                temp += arr[j];
                int length = j-i+1;
                if(length%2==1){
                result += temp;}
            }
        }
        return result;
    }
}