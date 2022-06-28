package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Set;
public final class World {

    private final Set<Continent> continentsSet ;

    public World(final Set<Continent> theContinents ) {
        this.continentsSet=theContinents;
    }
    public BigDecimal getPeopleQuantity (){
    return continentsSet.stream()
            .flatMap(continent -> continent.getListCountry().stream())
            .map(Country::getPeopleQuantity)
            .reduce(BigDecimal.ZERO, (sum,current)->sum=sum.add(current));
    }
}
