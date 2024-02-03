package org.iago.map.Ordenacao.OnlineLibrary;

import java.util.Comparator;
import java.util.Map;

public class ComparatorByPrice implements Comparator<Map.Entry<String,Book>> {

    @Override
    public int compare(Map.Entry<String, Book> stringBook1, Map.Entry<String, Book> stringBook2) {
        return Double.compare(stringBook1.getValue().getPrice(), stringBook2.getValue().getPrice());
    }
}
