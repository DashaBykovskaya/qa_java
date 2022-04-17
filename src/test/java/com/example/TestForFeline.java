package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestForFeline {

    @Test
    public void getKittensForFelineTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens(1);
        int expected = 1;
        assertEquals("Kittens count = 1", expected, actual);
    }

    @Test
    public void getFamilyForFelineTest() {
        Feline feline = new Feline();
        String actual = feline.getFamily("Кошачьи");
        String expected = "Кошачьи";
        assertEquals("Ожидаемый результат: Кошачьи", expected, actual);
    }

    @Test
    public void getEatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Ожидаемый результат:[Животные, Птицы, Рыба].", expected, actual);
    }

}

