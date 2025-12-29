class Solution {
    public boolean hasSameDigits(String s) {
        char[] arr=s.toCharArray();
      int sum=0;
      while(arr.length>2){
        char[] newarr=new char[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
     sum=((arr[i]-'0')+(arr[i+1]-'0'))%10;
     arr[i]=(char)(sum+'0');
     newarr[i]=arr[i];
        }
     arr=newarr;
      }
    return arr[0]==arr[1];
}
}