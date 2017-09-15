package com.amin.crypto;

import com.amin.crypto.health.CryptoServiceHealthCheck;
import com.amin.crypto.resources.CryptoPriceResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.client.JerseyClientBuilder;

import javax.ws.rs.client.Client;

public class CryptoPriceServiceApplication extends Application<CryptoPriceServiceConfiguration> {

    public static void main(final String[] args) throws Exception {
        new CryptoPriceServiceApplication().run(args);
    }

    @Override
    public String getName() {
        return "CryptoPriceService";
    }

    @Override
    public void initialize(final Bootstrap<CryptoPriceServiceConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final CryptoPriceServiceConfiguration configuration,
                    final Environment environment) {
        final Client client = new JerseyClientBuilder(environment).using(configuration.getJerseyClientConfiguration()).build(getName());

        final CryptoPriceResource cryptoPriceResource = new CryptoPriceResource(client);
        final CryptoServiceHealthCheck cryptoServiceHealthCheck = new CryptoServiceHealthCheck(cryptoPriceResource);
        environment.jersey().register(cryptoPriceResource);
        environment.healthChecks().register("CryptoPriceHealthCheck", cryptoServiceHealthCheck);
    }

}
