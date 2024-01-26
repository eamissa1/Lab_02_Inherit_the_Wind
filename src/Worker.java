public class Worker extends Person
{
    private double hourlyPayRate;

    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate)
    {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate()
    {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate)
    {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked)
    {
        if (hoursWorked <= 40)
        {
            return hoursWorked * hourlyPayRate;
        } else {
            // Regular pay for first 40 hours
            double regularPay = 40 * hourlyPayRate;
            // Overtime pay(time and a half) for hours above 40
            double overtimePay = (hoursWorked - 40) * hourlyPayRate * 1.5;
            return regularPay + overtimePay;
        }
    }

    public String displayWeeklyPay (double hoursWorked)
    {
        if (hoursWorked <= 40)
        {
            return "Regular Pay for " + hoursWorked + " hours: $" + calculateWeeklyPay(hoursWorked);
        } else {
            double regularPay = 40 * hourlyPayRate;
            double overtimePay = (hoursWorked - 40) * hourlyPayRate * 1.5;
            return "Regular Pay for 40 hours: $" + regularPay + ", Overtime Pay for " + (hoursWorked -40) +
                    " hours: $" + overtimePay + ", Total Pay: $" + (regularPay + overtimePay);
        }
    }
}
