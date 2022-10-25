import java.util.Scanner;

public class StudentModel{
    public Student inputStudent(Scanner sc){
        Student student = new Student();
        System.out.println("Nhap ten hoc sinh:");
        student.setName(sc.nextLine());
        System.out.println("Nhap dia chi hoc sinh:");
        student.setAddress(sc.nextLine());
        return student;
    }
}