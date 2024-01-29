package org.iago.map.Search.WordCount;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        WordCount wordCount = new WordCount();

        wordCount.setWord("Word", 27);
        wordCount.setWord("Count", 24);

        wordCount.showWordsAndCount();
        System.out.println(wordCount.getMostFrequentWord());

        System.out.println("Removing the word 'Word' of this word count");
        wordCount.removeWord("Word");
        wordCount.showWordsAndCount();

    }

    Map<String, Integer> wordCount;

    public WordCount(){
        wordCount = new HashMap<>();
    }

    public void setWord(String word, Integer count){
        wordCount.put(word, count);
    }

    public void removeWord(String word){
        wordCount.remove(word);
    }

    public void showWordsAndCount(){
        if(!wordCount.isEmpty()){
            System.out.println(wordCount);
        } else {
            System.out.println("There aren't words in this counter");
        }
    }

    public Map<String, Integer> getMostFrequentWord(){
        String mostFrequentWord = null;
        Integer mostFrequentCount = 0;
        Map<String, Integer> wordMap = new HashMap<>();
        if(!wordCount.isEmpty()){
            for (Map.Entry<String, Integer> countEntry: wordCount.entrySet()){
                if(countEntry.getValue() > mostFrequentCount){
                    mostFrequentWord = countEntry.getKey();
                    mostFrequentCount = countEntry.getValue();
                }
            }
            wordMap.put(mostFrequentWord, mostFrequentCount);
        } else {
            System.out.println("There aren't words in this counter");
        }
        return wordMap;
    }


}
