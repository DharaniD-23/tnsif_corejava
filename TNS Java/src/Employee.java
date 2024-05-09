
public class Employee {
    private String name;
    private int employeeId;
    private double salary;

    // Constructor with all parameters
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }
    public static void main(String[] args) {
        // Creating an Employee object using the constructor with all parameters
        Employee emp1 = new Employee("Dharani", 2003, 50000.0);

        // Printing details of the employee
        System.out.println("Employee name: " + emp1.getName());
        System.out.println("Employee ID: " + emp1.getEmployeeId());
        System.out.println("Employee salary: $" + emp1.getSalary());
    }
}
		