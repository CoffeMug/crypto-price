package com.amin.crypto;

import io.dropwizard.Configuration;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.client.JerseyClientConfiguration;

import javax.validation.Valid;
import javax.validation.constraints.*;

class CryptoPriceServiceConfiguration extends Configuration {
    @Valid
    @NotNull
    private JerseyClientConfiguration jerseyClient = new JerseyClientConfiguration();

    @JsonProperty("jerseyClient")
    JerseyClientConfiguration getJerseyClientConfiguration() {
        return jerseyClient;
    }
}
