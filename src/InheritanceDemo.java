import java.util.ArrayList;
import java.util.List;
public class InheritanceDemo
{
    public static void main(String[] args)
    {
        // Create Workers
        Worker worker1 = new Worker("000001", "Elisa", "Amissah", "Ms.", 2000, 20.0);
        Worker worker2 = new Worker("000002", "Bilbo", "Baggins", "Esq.", 1972, 22.0);
        Worker worker3 = new Worker("000003", "Frodo", "Baggins", "Dr.", 1990, 18.5);

        // Create salary workers
        SalaryWorker salaryWorker1 = new SalaryWorker("000004", "Samwise", "Gamgee", "Mr.", 1988, 0, 60000);
        SalaryWorker salaryWorker2 = new SalaryWorker("000005", "Peregrin", "Took", "Esq.", 1971, 0, 55000);
        SalaryWorker salaryWorker3 = new SalaryWorker("000006", "Meridoc", "Brandybuck", "Mrs.", 1979, 0, 50000);

        // Add all workers to a list
        List<Worker> workers = new ArrayList<>();
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(salaryWorker1);
        workers.add(salaryWorker2);
        workers.add(salaryWorker3);

        // Simulate 3 weekly pay periods
        int[] hours = {40, 50, 40}; // Hours for each week
        for (int week = 0; week < hours.length; week++)
        {
            System.out.println("Week " + (week + 1) + " Payroll:");
            System.out.println("================================================================================================");
            for (Worker worker : workers) {
                System.out.println(worker.formalName() + ": " + worker.displayWeeklyPay(hours[week]));
            }
            System.out.println();
        }
    }
}