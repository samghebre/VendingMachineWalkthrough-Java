package com.codedifferently.walkthrough.vendingmachine.inventory;
import org.junit.Assert;
import org.junit.Test;

public class CandyTest {

 @Test
 public void  constructorTest(){
     //Given
     String name = "Bag of Gummi bears";
     Double price = 1.75;
     Candy candiesRef = new Candy();

     //When
    String expected = "Bag of candies 1.75";
    String actual = candiesRef.toString();

    //Then
    Assert.assertEquals(expected,actual);

     }

    @Test
    public void messageTest() {
        //Given
    Candy candiesRef = new Candy();

        //When
        String expected = "Munch Munch, Yum!";
        String actual = candiesRef.message();

        //Then
        Assert.assertEquals(expected,actual);
}
}