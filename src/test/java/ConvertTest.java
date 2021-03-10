import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConvertTest {

    @Test
    void testConvertLength() {
        // fail("This test is not yet implemented.");
        double expected = 39.3701;
        double actual = Convert.convertLengthFromCentToInch(100);
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void testConvertLengthForCmToInches() {
        //this length = centimeters
       double expected = 100;
       double actual = Convert.convertLength(240, "centimeters");
       assertEquals(expected, actual);
    }

    @Test
    void testConvertLengthForInchesToCm() {
        //this length = centimeters
        double expected = 240;
        double actual = Convert.convertLength(100, "inches");
        assertEquals(expected, actual);
    }
}
