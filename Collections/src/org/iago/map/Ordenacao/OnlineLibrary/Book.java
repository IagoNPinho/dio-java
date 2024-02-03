package org.iago.map.Ordenacao.OnlineLibrary;

public class Book {
    String title;
    String author;
    double price;

    public Book (String title, String author, double price){
        setTitle(title);
        setAuthor(author);
        setPrice(price);
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setAuthor(String author) {
        this.author = author;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book " + title + " write by " + author + " cust $" + price;
    }
}
