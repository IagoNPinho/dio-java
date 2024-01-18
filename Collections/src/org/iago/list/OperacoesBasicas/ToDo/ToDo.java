package org.iago.list.OperacoesBasicas.ToDo;

public class ToDo {
    // Atribute private
    private String description;

    // Construtor
    public ToDo(String description) {
        setDescription(description);
    }

    // Setter
    private void setDescription(String description){
        this.description = description;
    }

    // Getter
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
