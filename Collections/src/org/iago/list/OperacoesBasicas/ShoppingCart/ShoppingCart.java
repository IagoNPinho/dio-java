package org.iago.list.OperacoesBasicas.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setItem("Shower", 15.33, 2);
        cart.setItem("Mouse", 50.00, 1);
        cart.setItem("Mouse", 50.00, 1);

        System.out.println(cart.getAllItens());
        System.out.println("Cart's price is " + cart.getPriceCart());

        cart.removeItem("mouse");

        System.out.println(cart.getAllItens());
        System.out.println("Cart's price is " + cart.getPriceCart());
    }
    public List<Item> listItem;

    public ShoppingCart(){
        this.listItem = new ArrayList<>();
    }

    public void setItem(String description, double price, int quantity ){
        listItem.add(new Item(description, price, quantity));
    }

    public void removeItem(String description){
        List<Item> itensToRemove = new ArrayList<>();
        if(!listItem.isEmpty()){
            for(Item item : listItem){
                if(item.getDescription().equalsIgnoreCase(description)){
                    itensToRemove.add(item);
                }
            }
            listItem.removeAll(itensToRemove);
        } else{
            System.out.println("There aren't itens on the cart");
        }
    }

    public double getPriceCart(){
        double price = 0.0;
        for (Item item: listItem){
            price += item.getPrice() * item.getQuantity();
        }
        return price;
    }

    public List getAllItens(){
        return listItem;
    }
}
