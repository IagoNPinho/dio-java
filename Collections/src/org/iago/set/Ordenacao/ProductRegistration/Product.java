package org.iago.set.Ordenacao.ProductRegistration;

public class Product implements Comparable<Product>{
    private long cod;
    private String name;
    private double price;
    private int quantity;

    public Product (long cod, String name, double price, int quantity){
        setCod(cod);
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    private void setCod(long cod) {
        this.cod = cod;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public long getCod() {
        return cod;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product " + name + " cust $" + price + " it there are " + quantity + " in stock with code "+ cod;
    }

    @Override
    public int compareTo(Product product) {
        return name.compareToIgnoreCase(product.getName());
    }
}
