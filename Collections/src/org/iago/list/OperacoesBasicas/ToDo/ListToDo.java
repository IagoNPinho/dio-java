package org.iago.list.OperacoesBasicas.ToDo;

import java.util.ArrayList;
import java.util.List;

public class ListToDo {
    public static void main(String[] args) {
        ListToDo listToDo = new ListToDo();

        System.out.println("Total task number is " + listToDo.getLengthToDo());

        listToDo.addToDo("Todo 1");
        listToDo.addToDo("Todo 1");
        listToDo.addToDo("Todo 2");

        System.out.println("Total task number is " + listToDo.getLengthToDo());

        listToDo.removeToDo("Todo 2");

        System.out.println("Total task number is " + listToDo.getLengthToDo());

        System.out.println(listToDo.getAllToDo());
    }

    private List<ToDo> toDoList;

    public ListToDo(){
        this.toDoList = new ArrayList<>();
    }


    public void addToDo(String description) {
        toDoList.add(new ToDo(description));
    }

    public void removeToDo(String description){
        List<ToDo> toDoRemove = new ArrayList<>();
        for (ToDo toDo : toDoList){
            if(toDo.getDescription().equalsIgnoreCase(description)){
                toDoRemove.add(toDo);
            }
        }
        boolean removed = toDoList.removeAll(toDoRemove);
    }

    public int getLengthToDo(){
        return toDoList.size();
    }

    public List<ToDo> getAllToDo(){
        return toDoList;
    }

}
