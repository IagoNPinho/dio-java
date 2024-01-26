package org.iago.set.Ordenacao.ProductRegistration;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductRegistration {
    public static void main(String[] args) {
        ProductRegistration productRegistration = new ProductRegistration();

        productRegistration.setProduct(1208520258, "Ram 1500", 49999.99, 5);
        productRegistration.setProduct(1208520260, "Ram 3500", 89999.99, 5);
        productRegistration.setProduct(1208515895, "Ranger 3.2", 44999.99, 20);
        productRegistration.setProduct(1208520259, "Ram 2500", 69999.99, 8);
        productRegistration.setProduct(1208588554, "Amarok", 29999.99, 2);
        productRegistration.setProduct(1200000000, "Triton L200", 49999.99, 20);

        productRegistration.showProductByName();
        productRegistration.showProductByPrice();
    }

    Set<Product> productSet;

    public ProductRegistration() {
        productSet = new HashSet<>();
    }

    public void setProduct(long cod, String name, double price, int quantity){
        productSet.add(new Product(cod, name, price, quantity));
    }

    public void showProductByName(){
        if(!productSet.isEmpty()){
            Set<Product> productsOrdenedByName = new TreeSet<>(productSet);
            System.out.println(productsOrdenedByName);
        } else {
            System.out.println("There aren't product in this set!");
        }
    }

    public void showProductByPrice(){
        Set<Product> productsOrdenedByPrice = new TreeSet<>(new ComparatorByPrice());
        if(!productSet.isEmpty()){
            productsOrdenedByPrice.addAll(productSet);
            System.out.println(productsOrdenedByPrice);
        } else {
            System.out.println("There aren't product in this set!");
        }
    }
}
