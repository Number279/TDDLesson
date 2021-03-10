import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class SecondTest {

    private List<Integer> integerList;


    @BeforeEach
    void setUp() {
        System.out.println("Test started...");
        integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(10);
        integerList.add(15);
    }

    @AfterEach
    void tearDown(){
        System.out.println("Test resolved.");
        integerList.clear();
    }

    @Test
    void test(){
        int expected = 5;
        Integer actual = integerList.get(0);
        assertEquals(expected, actual);

    }

    @Test
    void anotherTest(){
        int expected = 5;
        Integer actual = integerList.get(0);
        assertEquals(expected, actual);
    }

    @Test
    void sizeTest(){
        Integer expected = 3;
        Integer actual = integerList.size();
        assertEquals(expected, actual);
    }

    @Test
    void allTest(){
        assertAll("numbers",
                () -> assertEquals(integerList.get(0), 5),
                () -> assertEquals(integerList.get(1), 10),
                () -> assertEquals(integerList.get(2), 15)
        );
    }

    @Test
    void githubTest(){

    }
}
