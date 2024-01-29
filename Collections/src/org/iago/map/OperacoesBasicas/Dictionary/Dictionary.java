package org.iago.map.OperacoesBasicas.Dictionary;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Dictionary {
    private Map<String, String> dictionary;

    public Dictionary(){
        this.dictionary = new HashMap<>();
    }

    public void setWord(String word, String definition){
        dictionary.put(word, definition);
    }

    public void removeWord(String word){
        if(!dictionary.isEmpty()){
            dictionary.remove(word);
        } else {
            System.out.println("This dictionary is empty");
        }
    }

    public void showWords(){
        if (!dictionary.isEmpty()){
            System.out.println(dictionary);
        } else {
            System.out.println("This dictionary is empty");
        }
    }

    public String getDefinitionByWord(String word){
        String definition = null;
        if (!dictionary.isEmpty()){
            definition = dictionary.get(word);
            if (definition == null){
                System.out.println("There isn't " + word + " in this dictionary!");
            }
        } else {
            System.out.println("This dictionary is empty");
        }
        return definition;
    }

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        dictionary.setWord("Car", "Vehicle with 4 wheels for 5 or 7 people.");
        dictionary.setWord("Motocicle", "Vehicle with 2 wheels for 2 people.");
        dictionary.setWord("Personal Computer (PC)", "Machine used to complet simple or complex tasks using binary mathematics and complex architecture.");

        dictionary.showWords();

        System.out.println("Remove Car of dictionary");
        dictionary.removeWord("Car");

        String definitionOfCar = dictionary.getDefinitionByWord("Car");
        if(definitionOfCar != null){
            System.out.println("Definition of Car is " + definitionOfCar);
        }

        String definitionOfPC = dictionary.getDefinitionByWord("Personal Computer (PC)");
        if(definitionOfPC != null){
            System.out.println("Definition of Persona Computer is " + definitionOfPC);
        }
    }
}


