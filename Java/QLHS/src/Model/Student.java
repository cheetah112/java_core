package Model;

import java.time.LocalDate;

public class Student{
    private String name;
    private LocalDate birthDay;
    private String hometown;
    
    public Student() {
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

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", birthDay=" + birthDay + ", hometown=" + hometown + "]";
    }

    
    
}