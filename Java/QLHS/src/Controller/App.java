package Controller;

import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.transform.SourceLocator;

import Model.Aclass;
import Model.School;
import Model.Student;

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);
        School school = new School();
        System.out.println("Nhap Khoa hoc: ");
        school.setCourse(sc.nextLine());
        System.out.println("Nhap ky hoc: ");
        school.setSemester(sc.nextLine());
        Aclass aclass = new Aclass();
        System.out.println("Nhap ten lop:");
        aclass.setName(sc.nextLine());
        System.out.println("Nhap so hoc sinh cua lop: ");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Student>students = new ArrayList<>();
        for(int i=0;i<n;i++ ){
            System.out.println("Nhap hoc sinh thu " + (i+1) + ":");
            students.add(aclass.inputStudent(sc));
        }
        aclass.setAclass(students);
        school.setClasses(aclass);
        System.out.println("Danh sach hoc sinh:");
        System.out.println(school.toString());
        System.out.println("-----------------------------------");
        System.out.println("Danh sach hoc sinh sinh nam 1985 va que o Thai Nguyen la:");
        for(Student s : students){
            if(s.getBirthDay().getYear()==1985 && s.getHometown().equals("Thai Nguyen")){
                System.out.println(s);
            }
        }
        System.out.println("-----------------------------------");
        System.out.println("Danh sach tat ca hoc sinh lop 10A1: " + aclass.toString());
    }
}
