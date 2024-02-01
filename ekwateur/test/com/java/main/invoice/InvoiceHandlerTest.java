package com.java.main.invoice;

import com.java.main.customer.*;
import org.junit.Assert;
import org.junit.Test;

public class InvoiceHandlerTest {
    @Test
    public void given130KWHElectricity150KWHGasAndIndividualCustomer_whenCalculateInvoice_thenReturnAppropriateDouble(){
        Customer customer = new IndividualCustomer(new CustomerId("12345678"), Civility.MR, "Jacques", "Tati");
        double actual = InvoiceHandler.calculateEnergyConsumptionCost(customer, 130, 150);
        Assert.assertEquals(32.97999954223633d, actual, 0);
    }
    @Test
    public void given130KWHElectricity150KWHGasAndProfessionalCustomer_whenCalculateInvoice_thenReturnAppropriateDouble(){
        Customer customer = new ProfessionalCustomer(new CustomerId("12345678"), "123445", "Tati", 10d);
        double actual = InvoiceHandler.calculateEnergyConsumptionCost(customer, 130, 150);
        Assert.assertEquals(32.28999900817871d, actual, 0);
    }
    @Test
    public void given130KWHElectricity150KWHGasAndBigCompanyCustomer_whenCalculateInvoice_thenReturnAppropriateDouble(){
        Customer customer = new ProfessionalCustomer(new CustomerId("12345678"), "123445", "Tati", 1_000_000d);
        double actual = InvoiceHandler.calculateEnergyConsumptionCost(customer, 130, 150);
        Assert.assertEquals(31.469999313354492d, actual, 0);
    }
}
