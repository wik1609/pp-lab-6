package company.models;

import company.abstracts.Employee;

public final class Worker extends Employee{ //klasa finalna dziedzicząca po klasie Employee
    public Worker(String name, double salary, int id, String hireDate, String position) {
        super(name, salary, id, hireDate, position);
    }
    public void work(){ //metoda work zwracająca wiadomość
        System.out.println("Worker " + getName() + " is working...");
    }
}
