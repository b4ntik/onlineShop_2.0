package org.skypro.skyshop.product;

public class DiscountProduct extends Product{
    int productPrice, discountedPrice;
    int discount;

    public DiscountProduct(String productName, int productPrice, int discount){
        super(productName);

        this.productPrice = productPrice - productPrice/discount;
        this.discount = discount;

    }

    @Override
    public int getProductPrice(){
        return productPrice;
    }
    @Override
    public String toString(){
        return getProductName() + ":  " + getProductPrice() + "(" + discount +")";
    }

    public boolean isSpecial() {

        isSpecial = true;

        return isSpecial;
    }




}
