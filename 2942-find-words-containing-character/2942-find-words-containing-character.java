class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
      ArrayList<Integer>map=new ArrayList<>();
            for(int j=0;j<words.length;j++){
                if(words[j].indexOf(x)!=-1){
                    map.add(j);
                }
            }
        
        return map;
    }
}