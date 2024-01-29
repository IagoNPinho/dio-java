package org.iago.map.Search.ProductsManager;

public class Product {
    private String name;
    private int quantity;
    private double price;

    public Product(String name, int quantity, double price){
        setName(name);
        setQuantity(quantity);
        setPrice(price);
    }


    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }


    private void setName(String name) {
        this.name = name;
    }
    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product " + name + " has " + quantity + " in stock and price by unit is " + price;
    }
}