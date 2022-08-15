import com.sun.source.doctree.SummaryTree;

import java.util.Objects;

public class Employee {
    private String name;

    private int departament;

    private int salary;
    private static int counter = 1;
    private int id;
    public String toString(){
        return "ФИО: " + name + " отдел №: " + departament +  " оклад в месяц: " + salary;
    }

    public Employee (String name, int departament, int salary) {
        this.name = name;
        this.departament = departament;
        this.salary = salary;
        this.id = counter++;
    }

    public String getName() {
        return name;
    }

    public int getDepartament() {
        return departament;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return departament == employee.departament && salary == employee.salary && id == employee.id && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, departament, salary, id);
    }
}
