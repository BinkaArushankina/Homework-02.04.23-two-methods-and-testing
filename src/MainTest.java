import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    Main main;
    @BeforeEach
    public void init(){
        main= new Main();
    }
    @Test
    public void testing_without_nNumber(){
        List<Integer> actual= Arrays.asList(1,2,3,4,5);
        List<Integer> expected= Arrays.asList(1,2,3);

        assertEquals(expected,main.without(actual,3));
    }

    @Test
    public void testing_without_emptyList(){
        List<Integer> actual= Arrays.asList();
        List<Integer> expected= Arrays.asList();

        assertEquals(expected,main.without(actual,3));
    }
    @Test
    public void testing_without_onlyThree(){
        List<Integer> actual= Arrays.asList(3,4);
        List<Integer> expected= Arrays.asList(3);

        assertEquals(expected,main.without(actual,3));
    }
    //_____________________________________________________________________________________________________________
    @Test
    public void testing_first(){
        List<String> actual= Arrays.asList("bb","a","ddd");
        String expected = "a";

        assertEquals(expected,main.first(actual));
    }

    @Test
    public void testing_first_a(){
        List<String > actual = Arrays.asList("a");
        String expected = "a";

        assertEquals(expected,main.first(actual));
    }

    @Test
    public void testing_first_moreStrings(){
        List<String > actual = Arrays.asList("aaa","bbb","ddd","cc");
        String expected = "aaa";

        assertEquals(expected,main.first(actual));
    }
    @Test
    public void testing_first_moreSameStrings(){
        List<String > actual = Arrays.asList("a","b","d","c");
        String expected = "a";

        assertEquals(expected,main.first(actual));
    }
}
