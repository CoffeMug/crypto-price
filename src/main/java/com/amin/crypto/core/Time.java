package com.amin.crypto.core;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Time {

    @JsonProperty
    private final String updated;
    @JsonProperty
    private final Date updatedISO;
    @JsonProperty
    private final String updateduk;

    public Time(@JsonProperty("updated") final String updated,
                @JsonProperty("updatedISO") final Date updatedISO,
                @JsonProperty("updateduk") final String updatedUK) {
        this.updated = updated;
        this.updatedISO = updatedISO;
        this.updateduk = updatedUK;
    }

    public String getUpdated() {
        return updated;
    }

    public Date getUpdatedISO() {
        return updatedISO;
    }

    public String getUpdatedUK() {
        return updateduk;
    }
}
