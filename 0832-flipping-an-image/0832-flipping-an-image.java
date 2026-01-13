class Solution {
    public static void reverse(int[] a){
      int s =0;
      int e =a.length-1;
while(s<=e){
    int temp=a[s];
    a[s]=a[e]^1;
    a[e]=temp^1;
    s++;
    e--;
    }
    }
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[]a:image){
            reverse(a);
        }
        return image;
    }
}
