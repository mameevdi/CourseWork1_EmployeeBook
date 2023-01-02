package skypro.courseworks;

import java.util.Objects;

//Базовая сложность
public class Employee {
    private int id;
    private String fullName;
    private int department;
    private double salary;
    private static int idCounter = 1;

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = idCounter++;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Employee employee = (Employee)o;
            return this.id == employee.id && this.department == employee.department && Double.compare(employee.salary, this.salary) == 0 && this.fullName.equals(employee.fullName);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.fullName, this.department, this.salary});
    }

    public String toString() {
        return "Id " + this.id + ". ФИО сотрудника: " + this.fullName + ". Отдел: " + this.department + ". Заработная плата: " + this.salary;
    }
}
