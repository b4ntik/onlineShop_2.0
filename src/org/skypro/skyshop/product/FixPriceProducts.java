package org.skypro.skyshop.product;

public class FixPriceProducts extends Product{
    public static final int FIXED_PRICE = 150;
    int productPrice;

    public FixPriceProducts(String productName){
        super(productName);
        this.productPrice = FIXED_PRICE;

    }

    @Override
    public int getProductPrice() {
        return FIXED_PRICE;
    }
    @Override
    public String toString(){
        return getProductName() + ": Фиксированная цена " + getProductPrice();
    }
    @Override
    public boolean isSpecial(){

        isSpecial = true;

        return isSpecial;
    }
}
