class Solution {
    public int maxDistance(String moves) {
     int x=0,y=0,cnt=0;
     for(char c:moves.toCharArray()){
        switch(c){
            case 'U':
            y++;
            break;
             case 'D':
            y--;
            break;
             case 'L':
            x--;
            break;
             case 'R':
            x++;
            break;
             case '_':
              cnt++;
            break;
        }
     }

     return Math.abs(x)+Math.abs(y)+cnt;
    }
}