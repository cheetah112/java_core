package Model;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Aclass {
    private String name;
    private ArrayList<Student> aclass;
   
    public Aclass() {
    }
   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Student> getAclass() {
        return aclass;
    }
    public void setAclass(ArrayList<Student> aclass) {
        this.aclass = aclass;
    }
   
    public Student inputStudent(Scanner sc){
        Student student = new Student();
        System.out.println("Nhap ten hoc sinh: ");
        student.setName(sc.nextLine());
        System.out.println("Nhap ngay sinh: (dd/MM/yyyy)");
        student.setBirthDay(LocalDate.parse(sc.nextLine(),DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Nhap que quan:");
        student.setHometown(sc.nextLine());
        return student;
    }


    @Override
    public String toString() {
        return "Aclass [name=" + name + ", aclass=" + aclass + "]";
    }
    
    

}
