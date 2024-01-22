package org.iago.list.Search.Book;

public class Book {
    private String title;
    private String author;
    private int publishedYear;

    public Book(String title, String author, int publishedYear){
        setTitle(title);
        setAuthor(author);
        setPublishedYear(publishedYear);
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setAuthor(String author) {
        this.author = author;
    }

    private void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    @Override
    public String toString() {
        return "Book " + title + " write by " + author + " and published in " + publishedYear;
    }
}
