
package com.example.productapp;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    public static List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            products.add(new Product(i, "Product " + i, i * 10.0));
        }
        return products;
    }
}
