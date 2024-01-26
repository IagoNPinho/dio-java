package org.iago.set.Search.Tasks;

import java.util.HashSet;
import java.util.Set;

public class Tasks {
    public static void main(String[] args) {
        Tasks taskSet = new Tasks();

        // taskSet.showTasks();

        taskSet.setTask("Clear House");

        taskSet.showTasks();
        System.out.println("There are/is " + taskSet.size() + " task/s in this set");

        taskSet.setTask("Close the door");
        taskSet.setTask("Clear House");
        taskSet.setTask("Learn Java");
        taskSet.setTask("To train at the gym");

        taskSet.showTasks();
        System.out.println("There are/is " + taskSet.size() + " in this set");
        System.out.println(taskSet.getAllTasksNotFinished());
        // System.out.println(taskSet.getAllTasksFinished());

        taskSet.setTaskFinished("clear house");
        // taskSet.setTaskFinished("Learn Flutter");
        taskSet.setTaskFinished("Learn Java");
        // taskSet.setTaskFinished("Learn Java");

        taskSet.showTasks();
        System.out.println("There are/is " + taskSet.size() + " in this set");
        System.out.println(taskSet.getAllTasksNotFinished());
        System.out.println(taskSet.getAllTasksFinished());

        taskSet.setTaskNotFinished("clear house");
        // taskSet.setTaskNotFinished("Learn Flutter");

        taskSet.showTasks();
        System.out.println("There are/is " + taskSet.size() + " in this set");
        System.out.println(taskSet.getAllTasksNotFinished());
        System.out.println(taskSet.getAllTasksFinished());

    }

    private Set<Task> taskSet;

    public Tasks(){
        taskSet = new HashSet<>();
    }

    public void setTask(String description){
        taskSet.add(new Task(description, false));
    }

    public void removeTask(String description){
        Task taskToRemove = null;
        if(!taskSet.isEmpty()){
            for(Task task: taskSet){
                if(task.getDescription().equalsIgnoreCase(description)){
                    taskToRemove = task;
                    taskSet.remove(taskToRemove);
                    break;
                }
            }
            if(taskToRemove == null){
                throw new RuntimeException("There isn't task with this description");
            }
        } else {
            throw new RuntimeException("There aren't tasks in this set!");
        }
    }

    public void showTasks(){
        if(!taskSet.isEmpty()){
            System.out.println(taskSet);
        } else{
            throw new RuntimeException("There aren't tasks in this set!");
        }
    }

    public int size(){
        return taskSet.size();
    }

    public Set<Task> getAllTasksFinished(){
        Set<Task> tasksFinished = new HashSet<>();
        if(!taskSet.isEmpty()){
            for(Task task: taskSet){
                if(task.isFinished()){
                    tasksFinished.add(task);
                }
            }
            if(tasksFinished.size() == 0){
                throw new RuntimeException("There isn't completed task in this set!");
            }
        } else {
            throw new RuntimeException("There aren't tasks in this set!");
        }
        return tasksFinished;
    }

    public Set<Task> getAllTasksNotFinished(){
        Set<Task> tasksNotFinished = new HashSet<>();
        if(!taskSet.isEmpty()){
            for(Task task: taskSet){
                if(!task.isFinished()){
                    tasksNotFinished.add(task);
                }
            }
            if(tasksNotFinished.size() == 0){
                throw new RuntimeException("There isn't uncompleted task in this set!");
            }
        } else {
            throw new RuntimeException("There aren't tasks in this set!");
        }
        return tasksNotFinished;
    }

    public void setTaskFinished(String description){
        Task taskCompleted = null;
        if(!taskSet.isEmpty()){
            for (Task task: taskSet){
                if (task.getDescription().equalsIgnoreCase(description)){
                    if(!task.isFinished()){
                        taskCompleted = task;
                        task.setFinished(true);
                        break;
                    } else {
                        throw new RuntimeException("This tasks is already completed!");
                    }
                }
            }
            if (taskCompleted == null){
                throw new RuntimeException("There isn't task with this description in this set!");
            }
        } else {
            throw new RuntimeException("There aren't tasks in this set!");
        }
    }

    public void setTaskNotFinished(String description){
        Task taskUncompleted = null;
        if(!taskSet.isEmpty()){
            for (Task task: taskSet){
                if (task.getDescription().equalsIgnoreCase(description)){
                    if(task.isFinished()){
                        taskUncompleted = task;
                        task.setFinished(false);
                        break;
                    } else {
                        throw new RuntimeException("This tasks is already Uncompleted!");
                    }
                }
            }
            if (taskUncompleted == null){
                throw new RuntimeException("There isn't task with this description in this set!");
            }
        } else {
            throw new RuntimeException("There aren't tasks in this set!");
        }
    }

    public void removeAllTasks(){
        if(!taskSet.isEmpty()){
            taskSet.clear();
        } else {
            throw new RuntimeException("There aren't tasks in this set!");
        }
    }
}
