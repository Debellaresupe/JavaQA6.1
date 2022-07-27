import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StartServiceTest {

    @Test
    public void testSum() {
        StartService service = new StartService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        assertEquals(actual, expected);

    }
    @Test
    public void testAverage() {
        StartService service = new StartService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.average(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        assertEquals(actual, expected);

    }
    @Test
    public void countBelowAvgTest() {
        StartService service = new StartService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.countBelowAvg(sales);
        int expected = 5;

        assertEquals(actual, expected);
    }
    @Test
    public void countUpAvgTest() {
        StartService service = new StartService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.countUpAvg(sales);
        int expected = 5;

        assertEquals(actual, expected);
    }
    @Test
    public void minSalesTest() {
        StartService service = new StartService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.minSales(sales);
        int expected = 9;

        assertEquals(actual, expected);
    }
    @Test
    public void maxSalesTest() {
        StartService service = new StartService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.maxSales(sales);
        int expected = 8;

        assertEquals(actual, expected);
    }

}
