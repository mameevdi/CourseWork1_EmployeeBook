package skypro.courseworks;

/**
 * Сотрудник
 */
public class Main {
    private static final Employee[] employees = {
            new Employee("Мамеев Дмитрий Михайлович", 1, 125600),
            new Employee("Трофимова Анастасия Алексеевна", 2, 98000),
            new Employee("Шкуратова Ирина Васильевна", 3, 106100),
            new Employee("Аветисян Эдгар Жораевич", 4, 58200),
            new Employee("Рогов Михаил Сергеевич", 1, 95700),
            new Employee("Пляко Александр Петрович", 5, 36050),
            new Employee("Иванова Дарья Сергеевна", 2, 67900),
            new Employee("Кротов Михаил Борисович", 4, 65000),
            new Employee("Калиниченко Елизавета Арсеньевна", 3, 115000),
            new Employee("Куценко Лиана Арсеновна", 1, 103000),

    };
    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double sumSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    public static Employee EmployeeMinSalary() {
        Employee result = employees[0];
        double minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee EmployeeMaxSalary() {
        Employee result = employees[0];
        double maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static double averageSalary() {
        double average = 0;
        sumSalary();
        average = sumSalary() / employees.length;
        return average;
    }

    public static void receiveFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    public static Employee findEmployeeMinSalary(int department) {
        double employeeMinSalary = Integer.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }
            if (employee.getSalary() < employeeMinSalary) {
                employeeMinSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findEmployeeMaxSalary(int department) {
        double employeeMaxSalary = Integer.MIN_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                continue;
            }
            if (employee.getSalary() > employeeMaxSalary) {
                employeeMaxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static double sumOfExpenses(int department) {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static double averageSalary(int department) {
        int countEmployee = 0;
        double sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
                countEmployee++;
            }
        }
        return sum / countEmployee;
    }

    public static void indexingWagesByDepartment(int department, int percent) {
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() + (employee.getSalary() * percent / 100));
                result = employee;
                System.out.println("Индексация зарплаты сотрудника отдела на " + percent + " процентов: " + result);
            }
        }
    }

    public static void printEmployeeOfDepartment(int department) {
        for (Employee employee : employees) {
            if ((employee.getDepartment() == department)) {
                System.out.println(employee.getFullName() + ", " + employee.getSalary());
            }
        }
    }

    public static void findUsingWithSmallerNumber(int number) {
        for (Employee employee : employees) {
            if (employee.getSalary() < number) {
                System.out.println(employee);
            }
        }
    }

    public static void findUsingWithBiggerNumber(int number) {
        for (Employee employee : employees) {
            if (employee.getSalary() > number) {
                System.out.println(employee);
            }
        }
    }

    public static void printSeparator() {
        System.out.println();
    }

    public static void main(String[] args) {
        printEmployees(); //Получить список всех сотрудников
        printSeparator();
        System.out.println("Сумма затрат на зарплаты в месяц: " +sumSalary()); //Посчитать сумму затрат на зарплаты.
        printSeparator();
        System.out.println("Сотрудник с минимальной заработной платой " + EmployeeMinSalary()); //Найти сотрудника с минимальной заплатой.
        printSeparator();
        System.out.println("Сотрудник с максимальной заработной платой " + EmployeeMaxSalary()); //Найти сотрудника с максимальной зарплатой.
        printSeparator();
        System.out.println("Среднее значение зарплат "+ averageSalary()); //Подсчитать среднее значение зарплат.
    }
}