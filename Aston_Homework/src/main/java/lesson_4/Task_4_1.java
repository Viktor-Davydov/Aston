package lesson_4;

public class Task_4_1 {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];

        employeeArray[0] = new Employee("Mikhail Mikhailov", "driver", "driver@kontora" +
                ".com", "89874344999", 55000, 39);
        employeeArray[1] = new Employee("Mr. Killman", "gardener", "gardener@kontora" +
                ".com", "89872468258", 66000, 40);
        employeeArray[2] = new Employee("Nadezhda Petrovna", "accountant", "petrovna" +
                "@kontora.com", "89872849367", 45000, 41);
        employeeArray[3] = new Employee("Ivan Ivanov", "cleaner", "cleaner@kontora.com"
                , "89878356786", 77000, 42);
        employeeArray[4] = new Employee("Olga Trudogolikova", "CEO", "ceo@kontora.com",
                "89877777777", 28000, 27);

        for (Employee employee : employeeArray) {
            if (employee.age > 40) {
                System.out.println(employee.getValues());
            }
        }
    }
}