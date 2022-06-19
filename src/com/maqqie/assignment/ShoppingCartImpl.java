package com.maqqie.assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ShoppingCartImpl implements ShoppingCart, Discount {

    private List<Product> productsInCart = new LinkedList<>();

    @Override
    public void addProduct(Product product) {
        productsInCart.add(product);
    }

    @Override
    public long calculateTotalAmountsInCents() {
        long total = 0l;
        for (Product product :
                productsInCart) {
            total += product - calculateDiscount(product);
        }
        return total;
    }

    @Override
    public long calculateDiscount(Product product) {
        switch (product) {
            case SPRINKLES: return product * 25/100;
            case PEANUT_BUTTER: return 0l;
            case COOKIES: return product/2;
        }
    }
}
