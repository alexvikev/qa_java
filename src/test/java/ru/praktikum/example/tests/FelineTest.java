package ru.praktikum.example.tests;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;


public class FelineTest {
    private Feline feline;

    @Before
    public void setup() {
        feline = new Feline();
    }

    @Test
    public void felineEatMeetReturnPredatorList() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals("Ошибка, список не для хищника!", expected, actual);
    }

    @Test
    public void felineGetFamilyReturnKoshachi() {
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals("Ошибка, семейство должно быть 'кошачьи'!", expected, actual);
    }

    @Test
    public void felineGetKittensWithoutArgumentReturn1() {
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals("Ошибка, должен вернуть единицу!", expected, actual);
    }
}