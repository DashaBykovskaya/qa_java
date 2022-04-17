package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestForAnimal {

    private final String animalKind;
    private final List expected;

    public TestForAnimal(String animalKind, List expected) {
        this.animalKind = animalKind;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getFoodTestAnimal() {
        return new Object[][]{{"Травоядное", List.of("Трава", "Различные растения")}, {"Хищник", List.of("Животные", "Птицы", "Рыба")}};
    }

    @Test
    public void getFoodTest() throws Exception {
        Animal animal = new Animal();
        List<String> actual = animal.getFood(animalKind);
        assertEquals("Ожидаемый и фактический результат не совпадают.", expected, actual);
    }

    @Test
    public void testGetFoodException() {
        Animal animal = new Animal();
        try {
            List<String> actual = animal.getFood("ololo");
        } catch (Exception exception) {
            assertEquals("Ожидаемый и фактический результат не совпадают.", "Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
        }
    }
}
