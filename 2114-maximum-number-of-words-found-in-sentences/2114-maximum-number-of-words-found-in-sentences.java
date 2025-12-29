class Solution {
    public int mostWordsFound(String[] sentences) {
    int count=0;
    for(String sentence : sentences){
        int wordcount =sentence.split(" ").length;
        if(wordcount>count){
            count=wordcount;
        }
    }
    return count;  
    }
}