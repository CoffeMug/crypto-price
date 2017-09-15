package com.amin.crypto.core;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Crypto {

    @JsonProperty
    private final Time time;

    @JsonProperty
    private final String disclaimer;

    @JsonProperty
    private final BPI bpi;

    public Crypto(@JsonProperty("time") final Time time,
                  @JsonProperty("disclaimer") final String disclaimer,
                  @JsonProperty("bpi") final BPI bpi) {
        this.time = time;
        this.disclaimer = disclaimer;
        this.bpi = bpi;
    }

    public Time getTime() {
        return time;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public BPI getBpi() {
        return bpi;
    }
}
