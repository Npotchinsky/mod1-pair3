package com.techelevator.crm;

import com.techelevator.hr.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CustomerTests {
    @Test
    public void customerBilledProperly(){
        Customer testomer = new Customer("test", "Testerson");
        Map<String,Double> testMap = new HashMap<>();
        testMap.put("Walking",12.99);
        testMap.put("Grooming", 300.00);
        testMap.put("Sitting", 6.50);
        Assert.assertEquals(319.49, testomer.getBalanceDue(testMap), 0.00);
    }

}
