package org.skypro.skyshop.product;

public abstract class Product {
    protected String productName;
    protected boolean isSpecial;

    public Product(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public abstract int getProductPrice();

    public boolean isSpecial(){
        if(getClass() != SimpleProduct.class){
            isSpecial = false;
        }
        return isSpecial;

    }

    public String toString() {
        return getProductName() + ": "+ getProductPrice();
    }
}
