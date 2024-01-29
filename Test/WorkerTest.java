import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class WorkerTest
{
    @Test
    public void testCalculateWeeklyPayNoOvertime()
    {
        Worker worker = new Worker("000001", "Elisa", "Amissah", "Ms.", 2000, 30.0);
        double pay = worker.calculateWeeklyPay(40);
        assertEquals(1200.0, pay, 0.01);
    }

    @Test
    public void testCalculateWeeklyPayWithOvertime()
    {
        Worker worker = new Worker("000002", "Samwise", "Gamgee", "Esq.", 1970, 20.0);
        double pay = worker.calculateWeeklyPay(45);
        assertEquals(950.0, pay, 0.01);
    }

    @Test
    public void testDisplayWeeklyPayNoOvertime()
    {
        Worker worker = new Worker("000004", "Peregrin", "Took", "Mr.", 1971, 30.0);
        String display = worker.displayWeeklyPay(40);
        String expected = "Regular Pay for 40.0 hours: $1200.0";
        assertEquals(expected, display);
    }

    @Test
    public void testDisplayWeeklyPayWithOvertime()
    {
        Worker worker = new Worker("000005", "Meridoc", "Brandybuck", "Mrs.", 1979, 20.0);
        String display = worker.displayWeeklyPay(45);
        String expected = "Regular Pay for 40 hours: $800.0, Overtime Pay for 5.0 hours: $150.0, Total Pay: $950.0";
        assertEquals(expected, display);
    }
}

