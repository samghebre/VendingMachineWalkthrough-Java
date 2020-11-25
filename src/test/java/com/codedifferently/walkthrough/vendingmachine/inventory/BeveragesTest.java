package com.codedifferently.walkthrough.vendingmachine.inventory;

import org.junit.Assert;
import org.junit.Test;

public class BeveragesTest {


    @Test
    public void constructorTest() {
        //Given
        String name = "Water";
        Double price = 2.0;
        Beverages drinkRef = new Beverages();
        //When
        String expected = "Spring Mineral Water 2.0";
        String actual = drinkRef.toString();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void messageTest() {
        //Given
        Beverages drinkRef = new Beverages();

        //When
        String expected = "Glug Glug Glug, sweet water!";
        String actual = drinkRef.message();

        //Then
        Assert.assertEquals(expected,actual);

    }


}
