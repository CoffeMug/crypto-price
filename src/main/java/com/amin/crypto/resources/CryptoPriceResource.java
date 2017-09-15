package com.amin.crypto.resources;

import com.amin.crypto.core.Crypto;

import javax.ws.rs.*;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.math.BigDecimal;

@Path("/crypto-price")
@Produces(MediaType.APPLICATION_JSON)
public class CryptoPriceResource {

    private static final String cryptoTarget = "https://api.coindesk.com/v1/bpi/currentprice/";

    private final Client cryptoClient;

    public CryptoPriceResource(final Client client) {
        this.cryptoClient = client;
    }

    @GET
    @Path("{currency}")
    public BigDecimal getPrice(@PathParam("currency") final String currencyID) {

        WebTarget webTarget = cryptoClient.target(cryptoTarget + currencyID + ".json");
        Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
        Response response = invocationBuilder.get();

        Crypto crypto = response.readEntity(Crypto.class);

        return crypto.getBpi().getBaseCurrency().getRate();
    }

}
