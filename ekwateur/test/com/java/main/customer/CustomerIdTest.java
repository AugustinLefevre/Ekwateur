package com.java.main.customer;

import org.junit.Assert;
import org.junit.Test;

public class CustomerIdTest {
    @Test(expected = RuntimeException.class)
    public void givenNullString_whenCreateNewCustomerId_thenThrowError(){
        new CustomerId(null);
    }
    @Test(expected = RuntimeException.class)
    public void givenEmptyString_whenCreateNewCustomerId_thenThrowError(){
        new CustomerId("");
    }
    @Test(expected = RuntimeException.class)
    public void givenStringWithLengthNotEqualsTo8_whenCreateNewCustomerId_thenThrowError(){
        new CustomerId("123456789");
    }
    @Test(expected = RuntimeException.class)
    public void givenNonDigitString_whenCreateNewCustomerId_thenThrowError(){
        new CustomerId("ABCD1234");
    }
    @Test
    public void givenValidString_whenCreateNewCustomerId_thenVerifyIdIsCreated(){
        CustomerId customerId = new CustomerId("12345678");
        String expected = "EKW12345678";
        String actual = customerId.getId();
        Assert.assertEquals(expected, actual);
    }
}
