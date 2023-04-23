import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTest {
    @Test
    public void testFilter(){
        List<String> input1 = new ArrayList<>();
        input1.add("Snake");
        input1.add("Snail");
        input1.add("Tiger");
        input1.add("Slug");
        StringChecker sc = new ListExamples();
        ListExamples.filter(input1, sc);
        //assertArrayEquals("Hi", new String[]{"Snake", "Snail", "Slug"}, , 0);

    }
}
