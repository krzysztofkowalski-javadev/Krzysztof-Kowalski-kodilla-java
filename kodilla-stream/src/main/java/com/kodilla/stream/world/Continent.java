package com.kodilla.stream.world;

import java.util.Set;

public final class Continent {
private final Set<Country> listCountry ;
private final String nameContinent;

    public Continent(final Set<Country> listCountry,final String nameContinent) {
        this.listCountry = listCountry;
        this.nameContinent = nameContinent;
    }

    public Set<Country> getListCountry() {
        return listCountry;
    }

    public String getNameContinent() {
        return nameContinent;
    }
}
