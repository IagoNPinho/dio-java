package org.iago.map.Ordenacao.OnlineLibrary;

import java.util.*;

public class OnlineLibrary {
    Map<String, Book> onlineLibrary;

    public OnlineLibrary (){
        onlineLibrary = new HashMap<>();
    }

    public void setBook(String link, String title, String author, double price){
        onlineLibrary.put(link, new Book(title, author, price));
    }

    public void removeBook(String title){
        List<String> keysToRemove = new ArrayList<>();
        if(!onlineLibrary.isEmpty()){
            for(Map.Entry<String, Book> bookEntry: onlineLibrary.entrySet()){
                if(bookEntry.getValue().getTitle().equalsIgnoreCase(title)){
                    keysToRemove.add(bookEntry.getKey());
                }
            }
            if (!keysToRemove.isEmpty()){
                for(String key: keysToRemove){
                    onlineLibrary.remove(key);
                }
            } else {
                System.out.println("There aren't books with this title");
            }
        } else {
            throw new NoSuchElementException("There aren't books in this Library");
        }
    }

    public void showBooksByPrice(){
        if (!onlineLibrary.isEmpty()){
            List<Map.Entry<String,Book>> booksToOrdened = new ArrayList<>(onlineLibrary.entrySet());

            Collections.sort(booksToOrdened, new ComparatorByPrice());

            Map<String, Book> booksOrdenedByPrice = new LinkedHashMap<>();

            for (Map.Entry<String, Book> bookEntry: booksToOrdened){
                booksOrdenedByPrice.put(bookEntry.getKey(), bookEntry.getValue());
            }
            System.out.println(booksOrdenedByPrice);
        } else {
            throw new NoSuchElementException("There aren't books in this Library");
        }
    }

    public void showBooksByAuthor(){
        if (!onlineLibrary.isEmpty()){
            List<Map.Entry<String,Book>> booksToOrdened = new ArrayList<>(onlineLibrary.entrySet());

            Collections.sort(booksToOrdened, new ComparatorByAuthor());

            Map<String, Book> booksOrdenedByAuthor = new LinkedHashMap<>();

            for (Map.Entry<String, Book> bookEntry: booksToOrdened){
                booksOrdenedByAuthor.put(bookEntry.getKey(), bookEntry.getValue());
            }
            System.out.println(booksOrdenedByAuthor);
        } else {
            throw new NoSuchElementException("There aren't books in this Library");
        }
    }

    public void getBookMostExpensive(){
        Map<String, Book> bookMostExpensive = new HashMap<>();
        double biggerPrice = Double.MIN_VALUE;

        if(!onlineLibrary.isEmpty()){
            for(Book book: onlineLibrary.values()){
                if(book.getPrice() > biggerPrice){
                    biggerPrice = book.getPrice();
                }
            }
        } else {
            throw new NoSuchElementException("There aren't books in this Library");
        }

        for (Map.Entry<String, Book> bookEntry: onlineLibrary.entrySet()){
            if (bookEntry.getValue().getPrice() == biggerPrice){
                Book book = onlineLibrary.get(bookEntry.getKey());
                bookMostExpensive.put(bookEntry.getKey(), book);
            }
        }

        if(!bookMostExpensive.isEmpty()){
            System.out.println(bookMostExpensive);
        }
    }

    public void getCheaperBook(){
        Map<String, Book> cheaperBook = new HashMap<>();
        double smallerPrice = Double.MAX_VALUE;

        if(!onlineLibrary.isEmpty()){
            for (Book book : onlineLibrary.values()){
                if(book.getPrice() > smallerPrice){
                    smallerPrice = book.getPrice();
                }
            }
        } else {
            throw new NoSuchElementException("There aren't books in this Library");
        }

        for(Map.Entry<String, Book> bookEntry: onlineLibrary.entrySet()){
            if(bookEntry.getValue().getPrice() == smallerPrice){
                Book book = onlineLibrary.get(bookEntry.getKey());
                cheaperBook.put(bookEntry.getKey(), book);
            }
        }

        if(!cheaperBook.isEmpty()){
            System.out.println(cheaperBook);
        }
    }
}
