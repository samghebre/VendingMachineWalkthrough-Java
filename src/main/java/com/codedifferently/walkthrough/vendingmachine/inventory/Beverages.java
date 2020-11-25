package com.codedifferently.walkthrough.vendingmachine.inventory;

public class Beverages extends Product {


    public Beverages(String name, Double priceIn) {
        super(name, priceIn);
        msg = "Glug Glug Glug, sweet water!";
    }

    public Beverages() {
        this("Spring Mineral Water", 2.0);
    }

        @Override
        public String message () {
            return msg;
        }
    }



