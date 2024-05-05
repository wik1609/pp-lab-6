package company.abstracts;

import company.interfaces.Employable;

public abstract class Employee implements Employable { //implementacja interfejsu Employable
    //Trzy pola prywatne name salary id
    private String name;
    private double salary;
    private int id;

    public Employee(String name, double salary, int id){ //przyjmowanie wartosci this
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() { //metoda publiczna getName
        return name; //zwracanie name
    }

    public double getSalary(){ //metoda publiczna getSalary
        return salary; //zwracanie salary
    }
    public abstract void work();
}
