import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class SalaryWorkerTest
{
    @Test
    public void testCalculateWeeklyPay()
    {
        SalaryWorker salaryWorker = new SalaryWorker("000001", "Elisa", "Amissah", "Ms.", 2000, 25.0, 52000.0);
        double weeklyPay = salaryWorker.calculateWeeklyPay(40); // hoursWorked is irrelevant for SalaryWorker
        assertEquals(1000.0, weeklyPay, 0.01);
    }

    @Test
    public void testDisplayWeeklyPay()
    {
        SalaryWorker salaryWorker = new SalaryWorker("000002", "Frodo", "Baggins", "Esq.", 1982, 25.0, 52000.0);
        String display = salaryWorker.displayWeeklyPay(40); // hoursWorked is irrelevant for SalaryWorker
        String expected = "Weekly Pay (as a fraction of Annual Salary): $1000.0";
        assertEquals(expected, display);
    }
}
