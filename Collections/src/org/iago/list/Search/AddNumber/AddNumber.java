package org.iago.list.Search.AddNumber;

import java.util.ArrayList;
import java.util.List;

public class AddNumber {
    public static void main(String[] args) {
        AddNumber addNumber = new AddNumber();

        addNumber.setNumber(10);
        addNumber.setNumber(-50);
        addNumber.setNumber(150);

        System.out.println("The summation of all number in the list is " +addNumber.getNumberSummation());
        System.out.println("The bigger number in the list is " +addNumber.getBiggerNumber());
        System.out.println("The smaller number in the list is " +addNumber.getSmallerNumber());
        System.out.println("All number in the list is " +addNumber.getAllNumber());

    }

    private List<Integer> numberList;

    public AddNumber(){
        numberList = new ArrayList<>();
    }

    public void setNumber(int number){
        numberList.add(number);
    }

    public int getNumberSummation(){
        int sum = 0;
        if(!numberList.isEmpty()){
            for(Integer integer: numberList){
                sum = sum + integer;
            }
        }
        return sum;
    }

    public int getBiggerNumber(){
        int biggerMumber = Integer.MIN_VALUE;
        if(!numberList.isEmpty()){
            for (Integer integer: numberList){
                if (integer > biggerMumber){
                    biggerMumber = integer;
                }
            }
        }else {
            throw new RuntimeException("There isn't number in the list");
        }
        return biggerMumber;
    }

    public int getSmallerNumber(){
        int smallerMumber = Integer.MAX_VALUE;
        if(!numberList.isEmpty()){
            for (Integer integer: numberList){
                if (integer < smallerMumber){
                    smallerMumber = integer;
                }
            }
        }else {
            throw new RuntimeException("There isn't number in the list");
        }
        return smallerMumber;
    }

    public List<Integer> getAllNumber(){
        return numberList;
    }
}
