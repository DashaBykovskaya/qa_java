package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestForLine {

    private String sex;
    private boolean expected;

    public TestForLine(String sex, boolean expected){
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getSexLion() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}

        };
    }


    @Test
    public void testLineSex() throws Exception {
        Lion lion = new Lion (sex);
        boolean actual = lion.hasMane;
        assertEquals(expected, actual);
    }

    @Test
    public void testExceptionSexLion() throws Exception {
        Lion lion = new Lion(sex);
        try {

        } catch (Exception exception) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
        }
    }

    @Test
    public void tesDoesHaveManeForLion() throws Exception{
        Lion lion = new Lion(sex);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected,actual);
    }

    @Test
    public void testGetKittensForLion() throws Exception{
        Feline lion = new Feline();
        int actual = lion.getKittens();
        int expected = 1;
        assertEquals(expected,actual);
    }
}