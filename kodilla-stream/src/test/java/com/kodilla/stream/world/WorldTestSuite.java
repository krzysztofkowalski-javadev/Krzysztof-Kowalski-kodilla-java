package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland =new Country(new BigDecimal(10000000),"Poland");
        Country spain =new Country(new BigDecimal(10000000),"Spain");
        Country cameroon =new Country(new BigDecimal(10000000),"Cameroon");
        Country kenya =new Country(new BigDecimal(10000000),"Kenia");

        Set<Country> countriesEurope= new HashSet<>();
        countriesEurope.add(poland);
        countriesEurope.add(spain);

        Continent europe= new Continent(countriesEurope, "Europe");
        Continent africa= new Continent(Stream.of(cameroon,kenya).collect(Collectors.toSet()),"Africa" );

        Set<Continent> continetsWorld =new HashSet();
        continetsWorld.add(europe);
        continetsWorld.add(africa);
        World theWorld = new World(continetsWorld);
        //When
        BigDecimal quantityWorld = theWorld.getPeopleQuantity();
        BigDecimal expectedQuantityWorld=new BigDecimal(40000000);
        //Then
        assertEquals(quantityWorld,expectedQuantityWorld);
    }
}
