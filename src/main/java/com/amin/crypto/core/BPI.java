package com.amin.crypto.core;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BPI {

    @JsonProperty
    private final Currency baseCurrency;

    @JsonProperty
    private final Currency additinalCurrency;

    public BPI(@JsonProperty("USD") final Currency baseCurrency,
               @JsonProperty("GBP") final Currency additionalCurrency) {
        this.baseCurrency = baseCurrency;
        this.additinalCurrency = additionalCurrency;
    }

    public Currency getBaseCurrency() {
        return baseCurrency;
    }

    public Currency getAdditinalCurrency() {
        return additinalCurrency;
    }
}
