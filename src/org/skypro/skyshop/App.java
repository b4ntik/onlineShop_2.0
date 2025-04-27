package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountProduct;
import org.skypro.skyshop.product.FixPriceProducts;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {
        Product product = new SimpleProduct("Хлеб", 100);
        Product product1 = new DiscountProduct("Молоко", 120, 10);
        Product product2 = new FixPriceProducts("Чай");
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