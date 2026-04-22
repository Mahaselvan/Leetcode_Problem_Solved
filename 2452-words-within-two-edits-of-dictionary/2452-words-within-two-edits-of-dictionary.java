class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
       List<String> res=new ArrayList<>();
        for(String str:queries){
             boolean found=false;
for(String dict:dictionary){
    int max=0;
            for(int i=0;i<dict.length();i++){
              if(str.charAt(i)!=dict.charAt(i)){
               max++;
              }
            if(max>2){
                break;
            }
            }
            if(max<=2){
                found=true;
                break;
            }
        }
      if(found){
  res.add(str);
      }
    }
      return res;
}
}