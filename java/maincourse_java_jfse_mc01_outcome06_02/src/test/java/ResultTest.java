import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class ResultTest {
    @Test
    public void cubeTest(){
        Result result = new Result();
        Assertions.assertEquals(27,result.findCube.cube(3));
    }
    @Test
    public void changeTest(){
        Result result = new Result();
        Assertions.assertEquals("AbCGf",result.changecase.casechange("aBcgF"));
    }
}