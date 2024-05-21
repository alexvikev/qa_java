package ru.praktikum.example.tests;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineGetKittensParameterizedTest {
    private final int count;
    private Feline feline;

    public FelineGetKittensParameterizedTest(int count) {
        this.count = count;
    }

    @Parameterized.Parameters
    public static Object[] counts() {
        return new Object[]{
            0,
            1,
            87,
            3,
            -1,
            1000,
        };
    }

    @Before
    public void setup() {
        feline = new Feline();
    }

    @Test
    public void felineGetKittensWithArgument() {
        int expected = count;
        int actual = feline.getKittens(count);
        assertEquals("Ошибка, значение аргумента и метода не совпадают!", expected, actual);
    }
}
