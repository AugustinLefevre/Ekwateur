package com.java.main.customer;

import java.util.Objects;

public class IndividualCustomer implements Customer{
    private CustomerId customerId;
    private Civility civility;
    private String name;

    private String lastName;

    public IndividualCustomer(CustomerId customerId, Civility civility, String name, String lastName) {
        this.customerId = customerId;
        this.civility = civility;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IndividualCustomer that = (IndividualCustomer) o;
        return Objects.equals(customerId, that.customerId) && civility == that.civility && Objects.equals(name, that.name) && Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, civility, name, lastName);
    }

    public CustomerId getCustomerId() {
        return customerId;
    }

    public void setCustomerId(CustomerId customerId) {
        this.customerId = customerId;
    }

    public Civility getCivility() {
        return civility;
    }

    public void setCivility(Civility civility) {
        this.civility = civility;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
