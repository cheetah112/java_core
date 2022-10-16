import java.time.LocalDate;

public class Employee {
    private String id;
    private String name;
    private LocalDate birthdDay;
    private double salary;
    private GENDER gender;
    public Employee(String id, String name, LocalDate birthdDay, double salary, GENDER gender) {
        this.id = id;
        this.name = name;
        this.birthdDay = birthdDay;
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
    public LocalDate getBirthdDay() {
        return birthdDay;
    }
    public void setBirthdDay(LocalDate birthdDay) {
        this.birthdDay = birthdDay;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public GENDER getGender() {
        return gender;
    }
    public void setGender(GENDER gender) {
        this.gender = gender;
    }


}


