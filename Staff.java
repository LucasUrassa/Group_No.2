public class Staff extends Person {
    private String department;
    private double salary;

    public Staff( String name, String address,String department, double salary) {
        super(name, address);
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff[" + super.toString() +
                ", department=" + department +
                ", salary=" + salary + "]";
    }

}
