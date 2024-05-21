package ru.praktikum.example.tests;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private Lion lion;

    @Mock
    private Feline feline;

    @Test
    public void lionGetKittensReturn1() throws Exception {
        lion = new Lion("Самец");
        int actual = 1;
        int expected = lion.getKittens();
        assertEquals("Ошибка, должен вернуть 1!", expected, actual);
    }

    @Test
    public void lionDoesHaveManeOfMaleLionReturnTrue() throws Exception {
        lion = new Lion("Самец");
        boolean actual = true;
        boolean expected = lion.doesHaveMane();
        assertEquals("Ошибка, самец должен быть с гривой!", expected, actual);
    }

    @Test
    public void lionDoesHaveManeOfFemaleLionReturnFalse() throws Exception {
        lion = new Lion("Самка");
        boolean actual = false;
        boolean expected = lion.doesHaveMane();
        assertEquals("Ошибка, самка должна быть без гривы!", expected, actual);
    }

    @Test
    public void lionGetFoodReturnPredatorList() throws Exception {
        lion = new Lion("Самец");
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood();
        assertEquals("Ошибка, список не для хищника!", expected, actual);
    }

    @Test
    public void lionCheckExceptionTest(){
        Exception exception = Assert.
                assertThrows(Exception.class, ()-> new Lion ("ЛевИзТайланда"));
        String expected = "Используйте допустимые значения пола животного - самей или самка";
        String actual = exception.getMessage();
        assertEquals("Ошибка, тектс исключения не верный!", expected, actual);
    }
}