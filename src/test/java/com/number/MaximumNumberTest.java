package com.number;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {

    @Test
    public void givenIntegerMaxNumber_WhenAtFirstPosition_ShouldReturnFirstNumber(){
        MaximumNumber maximumNumber = new MaximumNumber(95,75,45);
        Assert.assertEquals(95,maximumNumber.getLargeNumber());
    }

    @Test
    public void givenIntegerMaxNumber_WhenSecondPosition_ShouldReturnFirstNumber(){
        MaximumNumber maximumNumber = new MaximumNumber(10, 50, 30);
        Assert.assertEquals(50,maximumNumber.getLargeNumber());
    }

    @Test
    public void givenIntegerMaxNumber_WhenAtThirdPosition_ShouldReturnFirstNumber(){
        MaximumNumber maximumNumber = new MaximumNumber(60, 28, 91);
        Assert.assertEquals(91,maximumNumber.getLargeNumber());
    }

    @Test
    public void givenFloatMaxNumber_WhenAtFirstPosition_ShouldReturnFirstNumber(){
        MaximumNumber maximumNumber = new MaximumNumber(10.5f,15.5f,20.5f);
        Assert.assertEquals(20.5f,maximumNumber.getLargeNumber());
    }

    @Test
    public void givenFloatMaxNumber_WhenAtSecondPosition_ShouldReturnFirstNumber(){
        MaximumNumber maximumNumber = new MaximumNumber(10.0f,88.5f,12.4f);
        Assert.assertEquals(88.5f,maximumNumber.getLargeNumber());
    }


    @Test
    public void givenFloatMaxNumber_WhenAtThirdPosition_ShouldReturnFirstNumber(){
        MaximumNumber maximumNumber = new MaximumNumber(48.5f,30.5f,19.5f);
        Assert.assertEquals(48.5f,maximumNumber.getLargeNumber());
    }

    @Test
    public void givenStringMax_WhenAtFirstPosition_ShouldReturnFirstString(){
        MaximumNumber maximumNumber = new MaximumNumber("Sharad", "Rishi", "Rahul");
        Assert.assertEquals("Sharad",maximumNumber.getLargeNumber());
    }

    @Test
    public void givenStringMax_WhenSecondPosition_ShouldReturnFirstString(){
        MaximumNumber maximumNumber = new MaximumNumber("Sharad","Swapnil","Rinku");
        Assert.assertEquals("Swapnil",maximumNumber.getLargeNumber());
    }

    @Test
    public void givenStringMax_WhenThirdPosition_ShouldReturnFirstString(){
        MaximumNumber maximumNumber = new MaximumNumber("Ram","Rinku","Swapnil");
        Assert.assertEquals("Swapnil",maximumNumber.getLargeNumber());
    }


}
