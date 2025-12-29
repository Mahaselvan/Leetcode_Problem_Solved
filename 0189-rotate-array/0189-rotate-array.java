import java.util.Scanner;
class Solution {
    public void rotate(int[] arr, int r) {
        int n= arr.length;
        r=r%n;
        reverse(n-r,n-1,arr);
        reverse(0,n-r-1,arr);
        reverse(0,n-1,arr);
    }
    public void reverse(int st,int end,int arr[]){
         while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
         }
         }

      
    }
