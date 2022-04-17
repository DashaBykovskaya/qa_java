package com.example;

import net.bytebuddy.implementation.bytecode.Throw;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import javax.management.StringValueExp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class TestForLine {

    private final String sex;
    private final boolean expected;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    public TestForLine(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0},{1}")
    public static Object[][] getSexLion() {
        return new Object[][]{{"Самец", true}, {"Самка", false}};
    }

    @Test
    public void testLineSex() throws Exception {
        Lion lion = new Lion(sex);
        boolean actual = lion.hasMane;
        assertEquals("Ожидаемый и фактический результат не совпадают.", expected, actual);
    }

    @Test
    public void testExceptionSexLion() throws Exception {
            new Lion(sex);
        Exception exception = assertThrows(Exception.class, () -> {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        });
        }


        @Test
        public void tesDoesHaveManeForLion() throws Exception {
            Lion lion = new Lion(sex);
            boolean actual = lion.doesHaveMane();
            assertEquals("Ожидаемый и фактический результат не совпадают.", expected, actual);
        }

        @Test
        public void testGetKittensForLion() {
            Feline lion = new Feline();
            int actual = lion.getKittens();
            int expected = 1;
            assertEquals("Ожидаемый и фактический результат не совпадают.", expected, actual);
        }
    }