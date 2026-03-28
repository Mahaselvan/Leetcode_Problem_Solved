class Solution {
    public boolean isHappy(int n) {
       
        int slow=square(n);
        int fast=square(square(n));
        while(slow!=fast){
            slow=square(slow);
            fast=square(square(fast));
            if(fast==1||slow==1){
                return true;
            }
        }
        return slow==1;
    }
    public int square(int n){
        int sum=0;
        while(n!=0){
            int rem = n%10;
            sum=sum+rem*rem;
            n=n/10;
        }
        return sum;
    }
}