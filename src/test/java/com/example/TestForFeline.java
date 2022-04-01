package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestForFeline {

    @Test
    public void getKittensForFelineTest(){
        Feline feline = new Feline();
        int actual = feline.getKittens(1);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void getFamilyForFelineTest() {
        Feline feline = new Feline();
        String actual = feline.getFamily("Кошачьи");
        String expected = "Кошачьи";
        assertEquals(expected, actual);
    }

    @Test
    public void getEatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

}

