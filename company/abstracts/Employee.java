package company.abstracts;

import company.interfaces.Employable;

public abstract class Employee implements Employable { //implementacja interfejsu Employable
    //Trzy pola prywatne name salary id i nowe hireDate position
    private String name;
    private double salary;
    private int id;
    private String hireDate;
    private String position;

    public Employee(String name, double salary, int id, String hireDate, String position){ //przyjmowanie wartosci this
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.hireDate = hireDate;
        this.position = position;
    }

    public String getName() { //metoda publiczna getName
        return name; //zwracanie name
    }

    public double getSalary(){ //metoda publiczna getSalary
        return salary; //zwracanie salary
    }

    public String getHireDate(){ //metoda publiczna zwracajaca hireDate
        return hireDate;
    }

    public String getPosition(){ //metoda publiczna zwracajaca position
        return position;
    }

    public int hashCode(){
        return id;
    }
    public abstract void work();
}
