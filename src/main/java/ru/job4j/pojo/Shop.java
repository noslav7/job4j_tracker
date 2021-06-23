package ru.job4j.pojo;

public class Shop {

    public static int indexOfNull(Product[] products) {
        int product = 0;
        for (int i = 0; i < products.length; i++) {
                if (products[i] == null) {
                product = i;
                break;
            } else {
                    product = -1;
                }
        }
        return product;
    }
}
