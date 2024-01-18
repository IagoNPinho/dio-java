package org.iago.list.OperacoesBasicas.ShoppingCart;

public class Item {
    private String description;
    private double price;
    private int quantity;
    
    public Item(String description, double price, int quantity){
        setDescription(description, price, quantity);
    }

    private void setDescription(String description, double price, int quantity) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getDescription(){
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Item " + description + " costs $" + price + " and has " + quantity + " in the cart";
    }
}
