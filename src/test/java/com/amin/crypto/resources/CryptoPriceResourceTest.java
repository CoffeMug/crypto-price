package com.amin.crypto.resources;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CryptoPriceResourceTest {

    @Mock
    private CryptoPriceResource cryptoPriceResource;

    @Test
    public void getPrice() throws Exception {

        when(cryptoPriceResource.getPrice("blabla")).thenReturn("1.56");

        String price = cryptoPriceResource.getPrice("blabla");

        assertEquals("1.56", price);

    }

}