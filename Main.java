class Employee {

    private int id;
    private String name;
    private int age;
    private String designation;
    private double salary;

    private static String companyName = "ULAB";
    private static String companyAddress = "Beribadh Road, Mohammadpur";
    private static int employeeCount = 0;
    private static int idCounter = 1;

    public Employee(String name, int age, String designation, double salary) {
        this.id = idCounter++;
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
        employeeCount++;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: Tk " + salary);
        System.out.println("Company Name: " + companyName);
        System.out.println("Company Address: " + companyAddress);
        System.out.println();
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Number of Employees: " + employeeCount);
    }
}

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Jannatul Tazree", 30, "Software Engineer", 500000);
        Employee emp2 = new Employee("Immran Hossain Ayan", 35, "Product Manager", 10000000);
        Employee emp3 = new Employee("Tamvir Roza", 37, "Team Lead", 8000);
        Employee emp4 = new Employee("Saarah Khan", 40, "HR Manager", 10000);

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        emp3.displayEmployeeDetails();
        emp4.displayEmployeeDetails();

        Employee.displayTotalEmployees();
    }
}

