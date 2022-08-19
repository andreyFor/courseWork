public class Employee {

    private final String surname;

    private final String name;
    private final String lastName;

    private int department;

    private double employeeSalary;
    private int id;
    public Employee(String surname, String name, String lastName, int department, double employeeSalary) {
        this.surname = surname;
        this.name = name;
        this.lastName = lastName;
        this.department = department;
        this.employeeSalary = employeeSalary;

    }
    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public int getDepartment() {
        return department;
    }
    public double getEmployeeSalary() {
        return employeeSalary;
    }
    public int getId() {
        return id;
    }
    public void setDepartment(int department) {
        this.department = department;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}
