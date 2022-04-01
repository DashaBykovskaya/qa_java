package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestForCat {

    @Test
    public void getSoundForCatTest() throws Exception{
        Cat cat = new Cat(new Feline());
        String actual = cat.getSound("Мяу");
        String expected = "Мяу";
        assertEquals(expected, actual);
    }

}
