package com.java.main.customer;

import java.util.Objects;

public class ProfessionalCustomer implements Customer {

    private CustomerId customerId;

    private String siret;

    private String companyName;

    private double turnover;

    public ProfessionalCustomer(CustomerId customerId, String siret, String companyName, double turnover) {
        this.customerId = customerId;
        this.siret = siret;
        this.companyName = companyName;
        this.turnover = turnover;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfessionalCustomer that = (ProfessionalCustomer) o;
        return Double.compare(that.turnover, turnover) == 0 && Objects.equals(customerId, that.customerId) && Objects.equals(siret, that.siret) && Objects.equals(companyName, that.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, siret, companyName, turnover);
    }


    public CustomerId getCustomerId() {
        return customerId;
    }

    public void setCustomerId(CustomerId customerId) {
        this.customerId = customerId;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getTurnover() {
        return turnover;
    }

    public void setTurnover(double turnover) {
        this.turnover = turnover;
    }
}
