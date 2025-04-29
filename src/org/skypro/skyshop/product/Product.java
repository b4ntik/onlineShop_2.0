package org.skypro.skyshop.product;

import org.skypro.skyshop.searchEngine.Searchable;

public abstract class Product implements Searchable {
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


    public String getSearchTerm(String find){
        return getProductName() + "PRODUCT";
    }
    public String getNameSearchableObject() {
        return getProductName();
    }
    public String getStringRepresentation() {
        return getProductName() + "PRODUCT";
    }

    public String toString() {
        return getProductName() + ": "+ getProductPrice();
    }
}
