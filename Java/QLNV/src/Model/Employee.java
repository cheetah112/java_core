package Model;

import java.time.LocalDate;

public class Employee {
    private String id;
    private String name;
    private LocalDate birthDay;
    private double salary;
    private Gender gender;
    
 

    public Employee(String id, String name, LocalDate birthDay, double salary, Gender gender) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.salary = salary;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", birthDay=" + birthDay + ", salary=" + salary + ", gender="
                + gender + "]";
    }

}