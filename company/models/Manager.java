package company.models;

import company.abstracts.Employee;

public class Manager extends Employee { //dziedziczenie po klasie Employee

    public Manager(String name, double salary, int id, String hireDate, String position){
        super(name, salary, id, hireDate, position);
    }
    public void work() { //metoda work ktora zwraca wiadomosc
        System.out.println("Manager " + getName() + " is managing...");
    }
}
