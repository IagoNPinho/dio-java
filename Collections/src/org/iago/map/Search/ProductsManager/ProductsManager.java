package org.iago.map.Search.ProductsManager;

import java.util.HashMap;
import java.util.Map;

public class ProductsManager {
    public static void main(String[] args) {
        ProductsManager stockOfProducts = new ProductsManager();

        stockOfProducts.setProduct(1, "Triton L200", 5, 200000.00);
        stockOfProducts.setProduct(2, "Ram 3500", 3, 600000.00);
        stockOfProducts.setProduct(4, "Ranger", 1, 180000.00);
        stockOfProducts.setProduct(3, "Hilux", 2, 220000.00);
        stockOfProducts.setProduct(6, "Amarok", 2, 80000.00);

        stockOfProducts.showProduct();
        System.out.println(stockOfProducts.getCheaperProduct());
        System.out.println(stockOfProducts.getProductMostExpensiveByPrice());
        System.out.println(stockOfProducts.getMostExpensiveProductByTotalPrice());
        System.out.println(stockOfProducts.getTotalPriceOfStock());

    }
    private Map<Long, Product> stockOfProducts;

    public ProductsManager(){
        stockOfProducts = new HashMap<>();
    }

    public void setProduct(long code, String name, int quantity, double price){
        stockOfProducts.put(code, new Product(name, quantity, price));
    }

    public void showProduct(){
        if(!stockOfProducts.isEmpty()){
            System.out.println(stockOfProducts);
        } else {
            System.out.println("There aren't products in this stock");
        }
    }

    public double getTotalPriceOfStock(){
        double totalPriceOfStock = 0.0;
        if(!stockOfProducts.isEmpty()){
            for(Product product: stockOfProducts.values()){
                totalPriceOfStock += product.getPrice() * product.getQuantity();
            }
        } else {
            System.out.println("There aren't products in this stock");
        }
        return totalPriceOfStock;
    }

    public Product getProductMostExpensiveByPrice(){
        Product mostExpensiveProduct = null;
        double mostExpensivePrice = Double.MIN_VALUE;
        if(!stockOfProducts.isEmpty()){
            for(Product product: stockOfProducts.values()){
                if(product.getPrice() > mostExpensivePrice){
                    mostExpensiveProduct = product;
                    mostExpensivePrice = product.getPrice();
                }
            }
        } else {
            System.out.println("There aren't products in this stock");
        }
        return mostExpensiveProduct;
    }

    public Product getCheaperProduct(){
        Product cheaperProduct = null;
        double cheaperPrice = Double.MAX_VALUE;
        if(!stockOfProducts.isEmpty()){
            for(Product product: stockOfProducts.values()){
                if(product.getPrice() < cheaperPrice){
                    cheaperProduct = product;
                    cheaperPrice = product.getPrice();
                }
            }
        } else {
            System.out.println("There aren't products in this stock");
        }
        return cheaperProduct;
    }

    public Product getMostExpensiveProductByTotalPrice(){
        Product mostExpensiveProduct = null;
        double mostExpensivePrice = 0d;
        if(!stockOfProducts.isEmpty()){
            for(Map.Entry<Long, Product> productEntry: stockOfProducts.entrySet()){
                double stockProductPrice = productEntry.getValue().getPrice() * productEntry.getValue().getQuantity();
                if(stockProductPrice > mostExpensivePrice){
                    mostExpensivePrice = stockProductPrice;
                    mostExpensiveProduct = productEntry.getValue();
                }
            }
        } else {
            System.out.println("There aren't products in this stock");
        }
        return mostExpensiveProduct;
    }
}
