package org.iago.set.OperacoesBasicas.SingleWord;

import java.util.HashSet;
import java.util.Set;

public class CollectionSingleWord {
    public static void main(String[] args) {
        CollectionSingleWord collectionSingleWord = new CollectionSingleWord();

        System.out.println(collectionSingleWord.getAllSingleWordSet());
    }
    Set<String> singleWordSet;

    public CollectionSingleWord(){
        singleWordSet = new HashSet<>();
    }

    public void setWord(String word){
        singleWordSet.add(word);
    }

    public void removeWord(String word){
        singleWordSet.remove(word);
    }

    public boolean containsWord(String word){
        return singleWordSet.contains(word);
    }

    public Set<String> getAllSingleWordSet(){
        return singleWordSet;
    }
}
