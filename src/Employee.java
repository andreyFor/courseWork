public class Employee {
    private static int counter = 1;

    private final String surname;

    private final String name;
    private final String lastName;
    private int department;
    private double employeeSalary;
    private final int id;
    public Employee(String surname, String name, String lastName, int department, double employeeSalary) {
        this.id = counter++;
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
    public double setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
        return employeeSalary;
    }
    public int setId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department=" + department +
                ", employeeSalary=" + employeeSalary +
                ", id=" + id +
                '}';
    }
}
