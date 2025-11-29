package com.mycompany.rpl2_pert2;

/**
 * @author ASUS
 */
public class Seller extends User {
    private String product;

    public void addProduct(String productName) {
        System.out.println("Seller menambahkan produk: " + productName);
        this.product = productName;
    }

    public String getProduct() {
        return product;
    }
}