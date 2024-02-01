package com.java.main.energy;

import com.java.main.customer.*;
import org.junit.Assert;
import org.junit.Test;

public class EnergyTest {
    @Test
    public void givenIndividualCustomer_whenGetElectricityPrice_ThenReturnAppropriateFloat(){
        Customer customer = new IndividualCustomer(new CustomerId("12345678"), Civility.MR, "Jacques", "Tati");
        float actual = EnergyType.ELECTRICITY.getPrice(customer);
        float expected = 0.121f;
        Assert.assertEquals(expected, actual, 0f);
    }
    @Test
    public void givenIndividualCustomer_whenGetGasPrice_ThenReturnAppropriateFloat(){
        Customer customer = new IndividualCustomer(new CustomerId("12345678"), Civility.MR, "Jacques", "Tati");
        float actual = EnergyType.GAS.getPrice(customer);
        float expected = 0.115f;
        Assert.assertEquals(expected, actual, 0f);
    }
    @Test
    public void givenProCustomer_whenGetElectricityPrice_ThenReturnAppropriateFloat(){
        Customer customer = new ProfessionalCustomer(new CustomerId("12345678"), "123445", "Tati", 10d);
        float actual = EnergyType.ELECTRICITY.getPrice(customer);
        float expected = 0.118f;
        Assert.assertEquals(expected, actual, 0f);
    }
    @Test
    public void givenProCustomer_whenGetGasPrice_ThenReturnAppropriateFloat(){
        Customer customer = new ProfessionalCustomer(new CustomerId("12345678"), "123445", "Tati", 10d);
        float actual = EnergyType.GAS.getPrice(customer);
        float expected = 0.113f;
        Assert.assertEquals(expected, actual, 0f);
    }
    @Test
    public void givenBigCompanyCustomer_whenGetElectricityPrice_ThenReturnAppropriateFloat(){
        Customer customer = new ProfessionalCustomer(new CustomerId("12345678"), "123445", "Tati", 1_000_000d);
        float actual = EnergyType.ELECTRICITY.getPrice(customer);
        float expected = 0.114f;
        Assert.assertEquals(expected, actual, 0f);
    }
    @Test
    public void givenBigCompanyCustomer_whenGetGasPrice_ThenReturnAppropriateFloat(){
        Customer customer = new ProfessionalCustomer(new CustomerId("12345678"), "123445", "Tati", 1_000_000d);
        float actual = EnergyType.GAS.getPrice(customer);
        float expected = 0.111f;
        Assert.assertEquals(expected, actual, 0f);
    }
}
