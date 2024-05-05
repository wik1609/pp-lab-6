import java.util.ArrayList;
import java.util.List;
import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) { //cztery instancje klasy Worker
        Worker worker1 = new Worker("Kuba", 3500,  1, "2019-02-03", "Elektronik");
        Worker worker2 = new Worker("Adam", 4000, 2, "2020-01-05", "Mechanik");
        Worker worker3 = new Worker("Andrzej", 3800, 1, "2023-05-16", "Automatyk");
        Worker worker4 = new Worker("Konrad", 4100, 1, "2024-01-25", "Informatyk");
        Manager manager2 = new Manager("Karol Kret", 6500, 101, "2024-03-03", "Junior Manager");
        Manager manager3 = new Manager("Karol Prokop", 8000, 102, "2024-03-03", "Senior Manager");// nowy manager


        List<Employee> employees = new ArrayList<>(); //lista typu Employee o nazwie employees
        //instancje klas manager i worker
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager2);
        employees.add(manager3);

        for (Employee employee : employees) {
            employee.work(); //metoda work dla kazdego pracownika
            //informacje o kazdym pracowniku
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() + ", Position: " + employee.getPosition() + ", Hire date: " + employee.getHireDate() + ", Salary: " + employee.getSalary() + ")");
            //hashcode dla kazdego pracownika
            System.out.println(employee.getName() + " has code: " + employee.hashCode());
            //Sprawdzanie czy pracownik jest typu Worker i czy jego ID jest rowne 1
            if (employee instanceof Worker && ((Worker) employee).getId() == 1){
                //wyswietlanie wynikow dla porownania
                System.out.println("Equals for worker1:");
                System.out.println("Worker1 equals worker2: " + employee.equals(worker2));
                System.out.println("Worker1 equals worker3: " + employee.equals(worker3));
                System.out.println("Worker1 equals worker4: " + employee.equals(worker4));
                System.out.println("Worker1 equals manager3: " + employee.equals(manager2));

            }
    }
}
}


