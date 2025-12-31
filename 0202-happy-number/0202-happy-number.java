class Solution {
    public boolean isHappy(int n) {
    
        if(n<=0){
            return false;
        }
     
     int a=n;
     int sum=0;
     
        while(n>9){
            sum=0;
            while(n!=0){
            int rem=n%10;
            sum=sum+rem*rem;
            n=n/10;
        }
        n=sum;}
       
        if(n==1||n==7){
            return true;
        }
        return false;
     }
    
}