package org.iago.set.Search.Tasks;

import java.util.Objects;

public class Task {
    private String description;
    private boolean isFinished;

    public Task(String description, boolean isFinished){
        setDescription(description);
        setFinished(isFinished);
    }

    private void setDescription(String description) {
        this.description = description;
    }

    public void setFinished(boolean finished) {
        this.isFinished = finished;
    }

    public String getDescription() {
        return description;
    }

    public boolean isFinished() {
        return isFinished;
    }

    @Override
    public String toString() {
        return "Task " + description + " is" + (isFinished ?"":"n't") + " finish" ;
    }
}
