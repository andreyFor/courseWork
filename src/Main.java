public class Main {
    private static final Employee[] EMPLOYEES = new Employee[10];
    public static void main(String[] args) {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            EMPLOYEES[0] = new Employee("Пронюшкин","Антон","Юрьевич",1,100000.7);
            EMPLOYEES[1] = new Employee("Дюрдеев","Алексей","Алексеевич",1,67857.2);
            EMPLOYEES[2] = new Employee("Жабенко","Андрей","Олегович",2,115234);
            EMPLOYEES[3] = new Employee("Попов","Дмитрий","Иванович",2,76550.1);
            EMPLOYEES[4] = new Employee("Баяндин","Руслан","Григорьевич",3,94385);
            EMPLOYEES[5] = new Employee("Романов","Антон","Борисович",3,55347);
            EMPLOYEES[6] = new Employee("Поняшин","Руслан","Алексеевич",4,79990);
            EMPLOYEES[7] = new Employee("Патанин","Михаил","Михаилович",4,125744);
            EMPLOYEES[8] = new Employee("Березин","Олег","Генадьевич",5,91874);
            EMPLOYEES[9] = new Employee("Шульман","Екатерина","Борисовна",5,375524.5);
        }
        listOfAllEmployees();
        System.out.println();
        double totalMonthSalaries = totalMonthSalaries();
        System.out.println("Затраты компании на зарплату сотрудников за месяц: " + totalMonthSalaries);
        Employee employeeWithMinimalSalary = minSalaryEmployee();
        System.out.println("Сотрудник с минимальной месячной зарплатой: " + employeeWithMinimalSalary);
        Employee employeeWithMaximalSalary = maxSalaryEmployee();
        System.out.println("Сотрудник с максимальной месячной зарплатой: " + employeeWithMaximalSalary);
        double averageMonthSalaryOfAllEmployees = averageMonthSalaryOfAllEmployees();
        System.out.printf("Средняя месячная зарплата всех сотрудников: %.2f", averageMonthSalaryOfAllEmployees);
        System.out.println();
        listFullNamesOfAllEmployees();
    }

    private static void listOfAllEmployees() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }
    private static double totalMonthSalaries() {
        double sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum += employee.getEmployeeSalary();
        }
        return sum;
    }

    private static Employee minSalaryEmployee() {
        double minSalary = Double.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (EMPLOYEES[i].getEmployeeSalary() < minSalary) {
                minSalary = EMPLOYEES[i].getEmployeeSalary();
                index = i;
            }
        }
        if(index != -1){
            return EMPLOYEES[index];
        } else {
            return null;
        }
    }

    private static Employee maxSalaryEmployee() {
        double maxSalary = Double.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (EMPLOYEES[i].getEmployeeSalary() > maxSalary) {
                maxSalary = EMPLOYEES[i].getEmployeeSalary();
                index = i;
            }
        }
        if(index != -1){
            return EMPLOYEES[index];
        } else {
            return null;
        }
    }
    private static double averageMonthSalaryOfAllEmployees() {
        return totalMonthSalaries() / EMPLOYEES.length;
    }
    private static void listFullNamesOfAllEmployees() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getSurname() + " " + employee.getName() + " " + employee.getLastName());
        }
    }


}