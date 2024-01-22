package org.iago.list.OperacoesBasicas.ShoppingCart;

public class Item {
    private String description;
    private double price;
    private int quantity;
    
    public Item(String description, double price, int quantity){
        setDescription(description);
        setPrice(price);
        setQuantity(quantity);
    }

    // Setters
    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Getters
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
