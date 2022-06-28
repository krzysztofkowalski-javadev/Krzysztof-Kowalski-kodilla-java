package com.kodilla.stream.world;

import java.math.BigDecimal;
public final class Country {
    final BigDecimal peopleQuantity;
    final String nameCountry;
    public Country(final BigDecimal peopleQuantity,final String nameCountry) {
        this.peopleQuantity = peopleQuantity;
        this.nameCountry = nameCountry;
    }

    public String getNameCountry() {
        return nameCountry;
    }
    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
