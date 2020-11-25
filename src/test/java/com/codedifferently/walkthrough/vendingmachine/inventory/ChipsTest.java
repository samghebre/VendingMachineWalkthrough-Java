package com.codedifferently.walkthrough.vendingmachine.inventory;

import org.junit.Assert;
import org.junit.Test;

//import static org.junit.Assert.*;


public class ChipsTest {

    @Test
    public  void constructorTest() {
        //Given
        String name = "Sour Chips";
        Double price = 1.55;
        Chips chipRef = new Chips();

        //When
        String expected = "Sour Chips 1.55";
        String actual = chipRef.toString();

        //Then
        Assert.assertEquals("constructor chip",  expected, actual);
    }

    @Test
    public  void  messageTest() {

        //Given
        Chips chipsRef = new Chips();

        //When
        String expected = "Crunch Crunch, Yum!";
        String actual = chipsRef.message();

        //Then
        Assert.assertEquals(expected, actual);
    }

}