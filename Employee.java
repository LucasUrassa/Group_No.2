
/**
 * Write a description of class Employee here.
 *
 * @author (24BIA023)
 * @version (5/2/2026)
 */
public class Employee
{
    private String employeeId;
    private String fullName;
    private String department;
    private double basicSalary;
    private int yearsOfService;

    public Employee() {
        this.employeeId = "";
        this.fullName = "";
        this.department = "";
        this.basicSalary = 500000; 
        this.yearsOfService = 0;
    }

    public Employee(String employeeId, String fullName, String department, double basicSalary) {
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.department = department;

        if (basicSalary >= 500000) {
            this.basicSalary = basicSalary;
        } else {
            this.basicSalary = 500000;
            System.out.println("Salary cannot be least or under 50000");
        }

        this.yearsOfService = 0;
    }

    public String getemployeeId() {
        return employeeId;
    }

    public String getfullName() {
        return fullName;
    }

    public String getdepartment() {
        return department;
    }

    public double getbasicSalary() {
        return basicSalary;
    }

    public int getyearsofservice() {
        return yearsOfService;
    }

    public void setbasicSalary(double basicSalary) {
        if (basicSalary >= 500000) {
            this.basicSalary = basicSalary;
        } else {
            System.out.println("Salary must be at least 500000");
        }
    }

    public void setyearsofservice(int yearsOfService) {
        if (yearsOfService >= 0) {
            this.yearsOfService = yearsOfService;
        } else {
            System.out.println("Years of service cannot be negative");
        }
    }

    public void setdepartment(String department) {
        this.department = department;
    }
    
    public double calculateBonus() {
        double bonusRate = yearsOfService * 0.10;

        if (bonusRate > 0.50) {
            bonusRate = 0.50;
        }

        return basicSalary * bonusRate;
    }

    public double calculateNetSalary() {
        double bonus = calculateBonus();
        double grossSalary = basicSalary + bonus;
        double tax = grossSalary * 0.15;

        return grossSalary - tax;
    }

    public void promote(String newdepartment, double salaryIncrease) {
        this.department = newdepartment;
        setbasicSalary(this.basicSalary + salaryIncrease);
    }

    public void displayPayslip() {
        System.out.println("------ PAYSLIP ------");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + fullName);
        System.out.println("Department: " + department);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Years of Service: " + yearsOfService);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Net Salary: " + calculateNetSalary());
        System.out.println("---------------------\n");
    }

    public static void main(String[] args) {
        System.out.println("=== Employee Payroll Exercise ===\n");
        
        Employee employee1 = new Employee("EMP001", "Michael Urassa", "CYBER SECURITY", 1500000);
        Employee employee2 = new Employee("EMP002", "Happyness Costantine", "LAWYER", 1200000);

        employee1.setyearsofservice(5);
        employee2.setyearsofservice(2);

        employee1.displayPayslip();
        employee2.displayPayslip();

        employee1.promote("Senior CYBER SECURITY", 300000);

        employee1.displayPayslip();

        System.out.println("\n=== Exercise Complete ===");
    }
}
