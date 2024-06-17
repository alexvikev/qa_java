package ru.praktikum.example.tests;
import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    private Cat cat;

    @Mock
    public Feline feline;

    @Before
    public void setUp() {
        cat = new Cat(feline);
    }

    @Test
    public void catGetFoodReturnListOfPredatorFood() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = cat.getFood();
        assertEquals("Ошибка, список не для хищника!", expected, actual);
    }

    @Test
    public void catGetSoundReturnMiau() {
        String expected = "Мяу";
        String actual = cat.getSound();
        assertEquals("Ошибка, кот должен был сказать Мяу!", expected, actual);
    }
    
}