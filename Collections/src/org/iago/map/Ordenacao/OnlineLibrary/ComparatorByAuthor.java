package org.iago.map.Ordenacao.OnlineLibrary;

import java.util.Comparator;
import java.util.Map;

public class ComparatorByAuthor implements Comparator<Map.Entry<String,Book>> {
    @Override
    public int compare(Map.Entry<String, Book> stringBook1, Map.Entry<String, Book> stringBook2) {
        return stringBook1.getValue().getAuthor().compareToIgnoreCase(stringBook2.getValue().getAuthor());
    }
}
