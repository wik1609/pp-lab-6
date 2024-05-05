import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) { //cztery instancje klasy Worker
        Worker worker1 = new Worker("Kuba", 3500,  1, "2019-02-03", "Elektronik");
        Worker worker2 = new Worker("Adam", 4000, 2, "2020-01-05", "Mechanik");
        Worker worker3 = new Worker("Andrzej", 3800, 1, "2023-05-16", "Automatyk");
        Worker worker4 = new Worker("Konrad", 4100, 1, "2024-01-25", "Informatyk");
        Manager manager1 = new Manager("Damian Kot", 7500, 1, "2023-06-19", "Senior Manager");
        Manager manager2 = new Manager("Karol Kret", 6500, 101, "2024-03-03", "Junior Manager");
        Manager manager3 = new Manager("Karol Prokop", 8000, 102, "2024-03-03", "Senior Manager");// nowy manager


        List<Employee> employees = new ArrayList<>(); //lista typu Employee o nazwie employees
        //instancje klas manager i worker
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager1);
        employees.add(manager2);
        employees.add(manager3);

        double totalSalaryAllEmployees = 0; //suma pensji wszystkich pracownikow
        double totalSalaryAllManagers = 0; //suma pensji wszystkich Manager
        double totalSalaryAllWorkers = 0; //suma pensji wszystkich Worker

        Map<Integer, List<Employee>> employeesById = new HashMap<>(); //hashmapa przechowujaca pracownikow grupowanych wedlug id

         for (Employee employee : employees) {
            if (employee instanceof Manager) {
                totalSalaryAllManagers += employee.getSalary(); //dodanie pensji wszystkich Manager
            } else if (employee instanceof Worker) { 
                totalSalaryAllWorkers += employee.getSalary(); //dodanie pensji wszystkich Worker
            }

            totalSalaryAllEmployees += employee.getSalary(); //dodanie wszystkich pensji pracownikow

            int id = employee.getId();
            if (!employeesById.containsKey(id)) {
                employeesById.put(id, new ArrayList<>());
            }
            employeesById.get(id).add(employee);
        }

        System.out.println("Total salary of all employees: " + totalSalaryAllEmployees);
        System.out.println("Total salary of all managers: " + totalSalaryAllManagers);
        System.out.println("Total salary of all workers: " + totalSalaryAllWorkers);

        for (Map.Entry<Integer, List<Employee>> entry : employeesById.entrySet()) {
            int id = entry.getKey();
            List<Employee> employeesWithSameId = entry.getValue();
            if (employeesWithSameId.size() > 1) {
                System.out.println("Employees with the same ID (" + id + "):");
                for (Employee emp : employeesWithSameId) {
                    System.out.println("- " + emp.getName() + " (Position: " + emp.getPosition() + ")");

            }
    }
}
}
}

