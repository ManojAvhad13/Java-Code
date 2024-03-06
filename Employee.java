public class Employee {

    private int employeeId;
    private String name;
    private double salary;
    private boolean isFullTime;
    private String department;
    private String joining_date;

    // Static variable
    private static int numberOfEmployees = 0;

    public Employee(int employeeId, String name, double salary, boolean isFullTime, String department,
            String joining_date) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.department = department;
        this.joining_date = joining_date;

        // Count the number of employees
        numberOfEmployees++;
    }

    // Getters and setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJoining_date() {
        return joining_date;
    }

    public void setJoining_date(String joining_date) {
        this.joining_date = joining_date;
    }

    // Getter for static variable number Of Employees
    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Manoj Avhad", 55000, true, "Computer", "2024-03-01");
        Employee emp2 = new Employee(2, "Nilesh Kadnor", 60000, false, "IT", "2024-02-04");

        System.out.println("Employee 1");
        System.out.println("Id: " + emp1.getEmployeeId());
        System.out.println("Name: " + emp1.getName());
        System.out.println("Salary: " + emp1.getSalary());
        System.out.println("Department: " + emp1.getDepartment());
        System.out.println("Joining Date: " + emp1.getJoining_date() + "\n");

        System.out.println("Employee 2");
        System.out.println("Id: " + emp2.getEmployeeId());
        System.out.println("Name: " + emp2.getName());
        System.out.println("Salary: " + emp2.getSalary());
        System.out.println("Department: " + emp2.getDepartment());
        System.out.println("Joining Date: " + emp2.getJoining_date() + "\n");

        System.out.println("Number of Employees: " + Employee.getNumberOfEmployees());
    }
}
