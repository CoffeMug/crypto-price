package com.amin.crypto.health;

import com.amin.crypto.resources.CryptoPriceResource;
import com.codahale.metrics.health.HealthCheck;

public class CryptoServiceHealthCheck extends HealthCheck {

    private final CryptoPriceResource cryptoPriceResource;

    public CryptoServiceHealthCheck(final CryptoPriceResource cryptoPriceResource) {
        this.cryptoPriceResource = cryptoPriceResource;
    }

    @Override
    protected Result check() throws Exception {
        if (Double.valueOf(cryptoPriceResource.getPrice("blabla")).isNaN()) {
            return Result.unhealthy("Crypto service is not healthy!");
        } else {
            return Result.healthy();
        }
    }
}
