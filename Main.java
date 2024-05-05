import java.util.ArrayList;
import java.util.List;
import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) { //cztery instancje klasy Worker
        Worker worker1 = new Worker("Kuba", 3500,  1, "2019-02-03", "Elektronik");
        Worker worker2 = new Worker("Adam", 4000, 2, "2020-01-05", "Mechanik");
        Worker worker3 = new Worker("Andrzej", 3800, 3, "2023-05-16", "Automatyk");
        Worker worker4 = new Worker("Konrad", 4100, 4, "2024-01-25", "Informatyk");
        Manager manager2 = new Manager("Karol Kret", 6500, 101, "2024-03-03", "Junior Manager");

        List<Employee> employees = new ArrayList<>(); //lista typu Employee o nazwie employees
        //instancje klas manager i worker
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager2);

        for (Employee employee : employees) {
            employee.work();
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() + ", Position: " + employee.getPosition() + ", Hire date: " + employee.getHireDate() + ", Salary: " + employee.getSalary() + ")");
        
    }
}
}


