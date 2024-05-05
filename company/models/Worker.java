package company.models;

import company.abstracts.Employee;

public final class Worker extends Employee{ //klasa finalna dziedzicząca po klasie Employee
    public Worker(String name, double salary, int id) {
        super(name, salary, id);
    }
    public void work(){ //metoda work zwracająca wiadomość
        System.out.println("Worker " + getName() + " is working...");
    }
}
