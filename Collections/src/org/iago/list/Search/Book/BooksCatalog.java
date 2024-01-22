package org.iago.list.Search.Book;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class BooksCatalog {
    public static void main(String[] args) {
        BooksCatalog booksCatalog = new BooksCatalog();
        String author = "Robert C Martin";

        booksCatalog.addBook("Clean Code", author, 2008);
        booksCatalog.addBook("Clean Architecture", author, 2017);

        System.out.println(booksCatalog.getBookByTitle("Clean code"));
        System.out.println(booksCatalog.getBookByTitle("Clean Architecture"));



    }

    public List<Book> bookList;

    public BooksCatalog(){
        this.bookList = new ArrayList<>();
    }

    public void addBook(String title, String author, int publishedYear) {
        try {
            bookList.add(new Book(title, author, publishedYear));
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public List<Book> getBooksByAuthor(String author){
        List<Book> authorBook = new ArrayList<>();
        try {
            if(!bookList.isEmpty()){
                for (Book book: bookList){
                    if(book.getAuthor().equalsIgnoreCase(author)){
                        authorBook.add(book);
                    }
                }
            } else {
                System.out.println("There isn't book on the catalog");
            }
        } catch (Exception e){
            System.out.println(e);
        }
        return authorBook;
    }

    public List<Book> getBooksByPublishedYear(int initialYear, int finalYear){
        List<Book> bookByPublishedYear = new ArrayList<>();
        try {
            if(!bookList.isEmpty()){
                for (Book book: bookList){
                    if(book.getPublishedYear() >= initialYear && book.getPublishedYear() <= finalYear){
                        bookByPublishedYear.add(book);
                    }
                }
            } else {
                System.out.println("There isn't book on the catalog");
            }
        } catch (Exception e){
            System.out.println(e);
        }
        return bookByPublishedYear;
    }

    public Book getBookByTitle(String title){
        Book bookByTitle = null;
        try {
            if(!bookList.isEmpty()){
                for (Book book: bookList){
                    if(book.getTitle().equalsIgnoreCase(title)){
                        bookByTitle = book;
                        break;
                    }
                }
            }
        } catch (Exception e){
            System.out.println(e);
        }
        return bookByTitle;
    }

}
