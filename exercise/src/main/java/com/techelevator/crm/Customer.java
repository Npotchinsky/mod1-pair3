package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Customer extends Person implements Billable {
    private String phoneNumber;
    private List<Pet> pets = new ArrayList<>();


    public Customer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;
    }

    public Customer(String firstName, String lastName){
        new Customer(firstName,lastName,"");
    }


    @Override
    public double getBalanceDue(Map<String, Double> servicesRendered) {
        double balanceDue = 0;
        for (String string:servicesRendered.keySet()) {
            balanceDue += servicesRendered.get(string);
        }
        return balanceDue;
    }
}
