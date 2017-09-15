package com.amin.crypto.core;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.jackson.JsonSnakeCase;

import java.math.BigDecimal;

@JsonSnakeCase
public class Currency {

    @JsonProperty
    private final CURCODE curcode;

    @JsonProperty
    private final BigDecimal rate;

    @JsonProperty
    private final String description;

    @JsonProperty
    private final float rateFloat;

    public Currency(@JsonProperty("code") final String code,
                    @JsonProperty("rate") final String rate,
                    @JsonProperty("description") final String description,
                    @JsonProperty("rate_float") final float rateFloat) {
        this.curcode = CURCODE.valueOf(code);
        this.rate = new BigDecimal(rate.replaceAll(",",""));
        this.description = description;
        this.rateFloat = rateFloat;
    }


    public CURCODE getCurcode() {
        return curcode;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public String getDescription() {
        return description;
    }

    public float getRateFloat() {
        return rateFloat;
    }
}
