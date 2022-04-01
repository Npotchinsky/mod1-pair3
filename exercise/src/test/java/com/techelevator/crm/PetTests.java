package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PetTests {
    @Test
    public void listVaccinationsWorks() {
        Pet testPet = new Pet("testName", "testSpecies");
        testPet.getVaccinations().add("Rabies");
        testPet.getVaccinations().add("Parvo");
        testPet.getVaccinations().add("Distemper");
        Assert.assertEquals("This list did not come out as expected","\"Rabies, Parvo, Distemper\"", testPet.listVaccinations());

    }


}
