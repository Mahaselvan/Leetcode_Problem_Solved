class Solution {
    public String firstPalindrome(String[] words) {
        
       for ( String s : words){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if (sb.toString().equals(s)){
        return s;
        }
        
       }
       return "";
    }
}