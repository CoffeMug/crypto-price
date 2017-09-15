package com.amin.crypto.resources;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CryptoPriceResourceTest {

    @Mock
    private CryptoPriceResource cryptoPriceResource;

    @Test
    public void getPrice() throws Exception {

        when(cryptoPriceResource.getPrice("blabla")).thenReturn(new BigDecimal(1.56));

        BigDecimal price = cryptoPriceResource.getPrice("blabla");

        assertEquals(1.56, price.doubleValue(), 0.001);

    }

}