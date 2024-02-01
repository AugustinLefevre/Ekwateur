package com.java.main.invoice;

import com.java.main.customer.Customer;
import com.java.main.energy.EnergyType;

public class InvoiceHandler {
    public static double calculateEnergyConsumptionCost(Customer customer, float consumptionElectricityKWH, float consumptionGasKWH){
        double electricityCost = consumptionElectricityKWH * EnergyType.ELECTRICITY.getPrice(customer);
        double gasCost = consumptionGasKWH * EnergyType.GAS.getPrice(customer);
        return electricityCost + gasCost;
    }
}
