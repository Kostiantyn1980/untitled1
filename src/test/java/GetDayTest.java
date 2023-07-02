import Assignment.GetDayUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GetDayTest {

    @Test
    public void testGetDay_Sunday() {
        GetDayUtil util = new GetDayUtil();
        String day = util.getDay(1);
        Assertions.assertEquals("Sunday", day);
    }

    @Test
    public void testGetDay_Monday() {
        GetDayUtil util = new GetDayUtil();
        String day = util.getDay(2);
        Assertions.assertEquals("Monday", day);
    }

    @Test
    public void testGetDay_Tuesday() {
        GetDayUtil util = new GetDayUtil();
        String day = util.getDay(3);
        Assertions.assertEquals("Tuesday", day);
    }

    @Test
    public void testGetDay_Wednesday() {
        GetDayUtil util = new GetDayUtil();
        String day = util.getDay(4);
        Assertions.assertEquals("Wednesday", day);
    }

    @Test
    public void testGetDay_Thursday() {
        GetDayUtil util = new GetDayUtil();
        String day = util.getDay(5);
        Assertions.assertEquals("Thursday", day);
    }

    @Test
    public void testGetDay_Friday() {
        GetDayUtil util = new GetDayUtil();
        String day = util.getDay(6);
        Assertions.assertEquals("Friday", day);
    }

    @Test
    public void testGetDay_Saturday() {
        GetDayUtil util = new GetDayUtil();
        String day = util.getDay(7);
        Assertions.assertEquals("Saturday", day);
    }

    @Test
    public void testGetDay_NumberLessThanOne() {
        GetDayUtil util = new GetDayUtil();
        String result = util.getDay(0);
        Assertions.assertEquals("The number should be equal or larger than 1", result);
    }

    @Test
    public void testGetDay_NumberGreaterThanSeven() {
        GetDayUtil util = new GetDayUtil();
        String result = util.getDay(8);
        Assertions.assertEquals("The number should be equal or smaller than 7", result);
    }

    @Test
    public void testGetDay_NullInput() {
        GetDayUtil util = new GetDayUtil();
        Assertions.assertThrows(NullPointerException.class, () -> util.getDay(null));
    }
}
