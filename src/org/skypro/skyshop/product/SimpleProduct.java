package org.skypro.skyshop.product;

public class SimpleProduct extends Product{
    private String productName;
    private int productPrice;

    public SimpleProduct(String productName, int productPrice){
        super(productName);
        this.productPrice = productPrice;

    }
    public void setProductPrice(int newProductPrice) {
        this.productPrice = newProductPrice;

    }

    public int getProductPrice() {
        return productPrice;
    }
    @Override
    public String toString(){
        return getProductName() + ": "+ getProductPrice();    }

    public boolean isSpecial() {

        isSpecial = false;

        return isSpecial;
    }

}

