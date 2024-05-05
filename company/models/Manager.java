package company.models;

import company.abstracts.Employee;

public class Manager extends Employee { //dziedziczenie po klasie Employee

    public Manager(String name, double salary, int id){
        super(name, salary, id);
    }
    public void work() { //metoda work ktora zwraca wiadomosc
        System.out.println("Manager " + getName() + " is managing...");
    }
}
