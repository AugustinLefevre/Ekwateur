package com.java.main.energy;

import com.java.main.customer.Customer;
import com.java.main.customer.IndividualCustomer;
import com.java.main.customer.ProfessionalCustomer;

public enum EnergyType {
    ELECTRICITY(0.121f, 0.118f, 0.114f), GAS(0.115f, 0.113f, 0.111f);

    public static final double MIN_BIG_COMPANY_TURNOVER = 1_000_000d;
    private final float individualPrice;
    private final float professionalPrice;
    private final float bigCompanyPrice;

    EnergyType(float individualPrice, float professionalPrice, float bigCompanyPrice) {
        this.individualPrice = individualPrice;
        this.professionalPrice = professionalPrice;
        this.bigCompanyPrice = bigCompanyPrice;
    }

    public float getPrice(Customer customer){
        if(customer instanceof IndividualCustomer){
            return individualPrice;
        }
        if(((ProfessionalCustomer) customer).getTurnover() < MIN_BIG_COMPANY_TURNOVER){
            return professionalPrice;
        }
        return bigCompanyPrice;
    }
}
