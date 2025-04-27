package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        Product product = new Product("Хлеб", 100);
        Product product1 = new Product("Молоко", 100);
        Product product2 = new Product("Чай", 200);
        ProductBasket basket = new ProductBasket();
        basket.addProductToBasket(product);
        basket.addProductToBasket(product1);
        basket.addProductToBasket(product2);
        basket.printBasket();
        System.out.println(basket.basketPrice());
        System.out.println(basket.findProduct("хлеб"));
        basket.cleanBasket();

        basket.printBasket();

    }
}