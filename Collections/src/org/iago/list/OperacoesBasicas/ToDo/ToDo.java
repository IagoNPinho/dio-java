package org.iago.list.OperacoesBasicas.ToDo;

public class ToDo {
    private String description;

    public ToDo(String description) {
        setDescription(description);
    }

    // Setters
    private void setDescription(String description){
        this.description = description;
    }

    // Getters
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
