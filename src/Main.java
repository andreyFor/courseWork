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

    }


}