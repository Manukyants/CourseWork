import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    private static Employee[] arrEmployee = new Employee[10];
    private static void printEmployeesList (){
        for (Employee employee : arrEmployee) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
    private static void summAndAverageSalary(){
        int sum = 0;
        int averageSum = 0;
        for (Employee element : arrEmployee){
            sum += element.getSalary();
            averageSum = sum / arrEmployee.length;
        }

        System.out.println("—умма затра на зарплату в мес€ц " + sum + " рублей");
        System.out.println("—реднее значение зарплат в мес€ц " + averageSum + " рублей");
    }
    private static void employeeMinSalary(){
        int minSummMonht = Integer.MAX_VALUE;
        String employeeWithMinSalary = null;
        for (Employee element : arrEmployee){
            if (element.getSalary() < minSummMonht){
                minSummMonht = element.getSalary();
                employeeWithMinSalary = element.getName();
            }
        }

        System.out.println("—отрудник с минимальной зарплатой - " + employeeWithMinSalary + " - " + minSummMonht + " рублей");
    }
    private static void employeeMaxSalary(){
        int maxSummMonth = Integer.MIN_VALUE;
        String employeeWithMaxSalary = null;
        for (Employee element : arrEmployee) {
            if (element.getSalary() > maxSummMonth) {
                maxSummMonth = element.getSalary();
                employeeWithMaxSalary = element.getName();
            }
        }
        System.out.println("—отрудник с максимальный зарплатой - " + employeeWithMaxSalary + " - " + maxSummMonth + " рублей");
    }
    private static void nameList(){
        for (Employee employee : arrEmployee){
            if (employee != null){
                System.out.println(employee.getName());
            }
        }
    }


    public static void main(String[] args) {
        arrEmployee[0] = new Employee("Petrov A.A.", 2, 120_000);
        arrEmployee[1] = new Employee("Tetrov A.A.", 1, 110_000);
        arrEmployee[2] = new Employee("Wetrov A.A.", 3, 130_000);
        arrEmployee[3] = new Employee("Setrov A.A.", 4, 180_000);
        arrEmployee[4] = new Employee("Detrov A.A.", 5, 140_000);
        arrEmployee[5] = new Employee("Fetrov A.A.", 4, 170_000);
        arrEmployee[6] = new Employee("Getrov A.A.", 3, 160_000);
        arrEmployee[7] = new Employee("Hetrov A.A.", 2, 170_000);
        arrEmployee[8] = new Employee("Jetrov A.A.", 1, 130_000);
        arrEmployee[9] = new Employee("Zetrov A.A.", 5, 150_000);

        printEmployeesList();
        summAndAverageSalary();
        employeeMinSalary();
        employeeMaxSalary();
        nameList();


    }
}