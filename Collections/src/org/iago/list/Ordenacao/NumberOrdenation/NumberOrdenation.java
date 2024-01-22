package org.iago.list.Ordenacao.NumberOrdenation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberOrdenation {
    public static void main(String[] args) {
        NumberOrdenation numberOrdenation = new NumberOrdenation();

        numberOrdenation.setNumber(10);
        numberOrdenation.setNumber(11);
        numberOrdenation.setNumber(15);
        numberOrdenation.setNumber(10);
        numberOrdenation.setNumber(-50);
        numberOrdenation.setNumber(250);

        System.out.println(numberOrdenation.getNumberListByAscending());
        System.out.println(numberOrdenation.getNumberListByDescendant());
    }

    private List<Integer> numberList;

    public NumberOrdenation(){
        numberList = new ArrayList<>();
    }

    public void setNumber(int number){
        numberList.add(number);
    }

    public List<Integer> getNumberListByAscending(){
        List<Integer> numberListByAscending = new ArrayList<>(numberList);
        if (!numberList.isEmpty()){
            Collections.sort(numberListByAscending);
        } else {
            throw new RuntimeException("There aren't Numbers on the list");
        }
        return numberListByAscending;
    }

    public List<Integer> getNumberListByDescendant(){
        List<Integer> numberListByDescendant = new ArrayList<>(numberList);
        if(!numberList.isEmpty()){
            numberListByDescendant.sort(Collections.reverseOrder());
        } else {
            throw new RuntimeException("There aren't Numbers on the list");
        }
        return numberListByDescendant;
    }


}
