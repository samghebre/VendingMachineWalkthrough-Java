package com.codedifferently.walkthrough.vendingmachine.inventory;

public class Chips extends Product {


    public Chips(String name, Double priceIn) {
        super(name, priceIn);
        msg = "Crunch Crunch, Yum!";
    }
    
    public Chips() {
        this("Sour Chips",1.55);
    }
        
        
        @Override
        public String message() {
            return msg;
        }
    }

