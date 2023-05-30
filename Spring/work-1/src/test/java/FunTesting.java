import org.example.Fun;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
public class FunTesting {
    @Test
    public void testCountStringsStartingWithH() {
        Fun fun = new Fun();
        List<String> strings = Arrays.asList("Hello", "world", "How", "are", "you");
        int count = fun.count(strings);
        assertEquals(2, count);
    }
}







