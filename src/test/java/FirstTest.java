import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FirstTest {

    @BeforeEach
    void beforeEachTest(){
        System.out.println("Test is running...");
    }

    @AfterEach
    void afterEachTest(){
        System.out.println("Test has resolved.");
    }

    @Test
    void returnBoolTest() {
        Boolean actual = Utility.returnBool();
        assertTrue(actual);
    }

    @Test
    void isBiggerTest(){
        Boolean actual = Utility.isLarger(6, 5);
        assertTrue(actual);
    }

    @Test
    void addTest(){
        int expected = 31;
        int actual = Utility.addInts(10, 21);
        assertEquals(expected, actual);
    }


}
