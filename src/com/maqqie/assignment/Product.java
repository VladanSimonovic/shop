package com.maqqie.assignment;

public enum Product {

    SPRINKLES(135),
    PEANUT_BUTTER(80),
    COOKIES(150);
    private long amountInCents;

    Product(long amountInCents) {
        this.amountInCents = amountInCents;
    }

    private long getAmountInCents() {
        return amountInCents;
    }
}
