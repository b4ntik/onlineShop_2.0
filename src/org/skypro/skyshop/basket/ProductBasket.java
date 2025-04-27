package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private Product[] basket;

    public ProductBasket(){
         basket = new Product[5];

    }
    public void addProductToBasket(Product product){
        for(int i = 0; i< basket.length; i++){
        if(basket[i] == null ){
            basket[i] = product;
            return;
        }
        if (basket[4] != null){
            System.out.println("Корзина уже полная");}
        }
    }
    public int basketPrice() {
        int sum = 0;
           for (int i =0; i <basket.length;  i ++) {
                if (basket[i] == null) { continue;}
                else {
                sum += basket[i].getProductPrice();
            }

        }return sum;
    }
    public void printBasket() {
        int sum = 0;
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] != null) {
                System.out.println(basket[i]);
                sum += basket[i].getProductPrice();
            }
        }
        if (sum != 0) {
            System.out.println("Итого: " + sum);
        } else System.out.println("Корзина пуста");

    }
    public boolean findProduct(String productName){
        boolean iFind =false;
        for (int i =0; i < basket.length; i++){
            if (basket[i] != null && productName.toLowerCase().equals(basket[i].getProductName().toLowerCase())){
                iFind = true; break;
            } else iFind = false;
        } return iFind;
    }
    public void cleanBasket(){
        for (int i = 0; i< basket.length; i++){
            if (basket[i] != null){
                basket[i] = null;

            }
        }
    }
}

