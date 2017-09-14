package com.amin.crypto;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

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
        // TODO: implement application
    }

}
