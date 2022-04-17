package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockTest {

    @Mock
    Cat cat;
    @Mock
    Feline feline;

    @Test
    public void testGetSoundForCat() throws Exception {
        cat.getSound("Мяу");
        Mockito.verify(cat).getSound("Мяу");
    }

    @Test
    public void testEatMeatForCat() throws Exception {
        cat.getFood();
        Mockito.verify(cat).getFood();
    }

    @Test
    public void testGetKittensFeline() throws Exception {
        feline.getFood("Хищник");
        Mockito.verify(feline).getFood("Хищник");
    }

}
