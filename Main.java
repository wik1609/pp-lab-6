import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) { //cztery instancje klasy Worker
        Worker worker1 = new Worker("Kuba", 3500,  1);
        Worker worker2 = new Worker("Adam", 4000, 2);
        Worker worker3 = new Worker("Andrzej", 3800, 3);
        Worker worker4 = new Worker("Konrad", 4100, 4);

        Manager manager1 = new Manager("Marek", 6700, 100); //jedna instancja klasy Manager
        //Wyswietlanie salary i metody work dla wszystkich instancji
        System.out.println("Salary of " + worker1.getName() + ": " + worker1.getSalary());
        worker1.work();

        System.out.println("Salary of " + worker2.getName() + ": " + worker2.getSalary());
        worker2.work();

        System.out.println("Salary of " + worker3.getName() + ": " + worker3.getSalary());
        worker3.work();

        System.out.println("Salary of " + worker4.getName() + ": " + worker4.getSalary());
        worker4.work();

        System.out.println("Salary of " + manager1.getName() + ": " + manager1.getSalary());
        manager1.work();
    }

}
