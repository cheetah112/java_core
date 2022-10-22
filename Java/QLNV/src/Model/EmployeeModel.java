package Model;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeModel {
    public Employee addEmployee(Scanner sc){
        System.out.println("Nhap id nhan vien:");
        String id = new String();
        id = sc.nextLine();
        System.out.println("Nhap ten nhan vien:");
        String name = new String();
        name = sc.nextLine();
        System.out.println("Nhap ngay sinh (dd/MM/yyyy) :");
        LocalDate birthDay = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Gioi tinh nhan vien: (M for Male, F for Female):");
        String g = sc.nextLine();
        Gender gender = Gender.Male;
        if(g.equals("M")){
            gender = Gender.Male;
        }else if(g.equals("F")){
            gender = Gender.Female;
        }else{
            System.out.println("Ban nhap sai Moi ban nhap lai.");
            
        }
        double salary;
        System.out.println("Moi ban nhap luong nhan vien:");
        salary = sc.nextDouble();
        Employee employee = new Employee(id, name, birthDay, salary, gender);
        return employee;
    }

    public void searchByid(ArrayList<Employee> employees, Scanner sc){
        System.out.println("Nhap id nhan vien muon tim kiem: ");
        String id = sc.nextLine();
        for(Employee e :  employees) {
            if(e.getId().equals(id)){
                System.out.println("Nhan vien can tim la:\n" + e.toString() );
                break;
            }else{
                System.out.println("Khong tim thay nhan vien.");
                break;
            }
        }
    }

    public void searchByName(ArrayList<Employee> employees, Scanner sc){
        System.out.println("Nhap ten ban muon tim: ");
        String name = sc.nextLine();
        System.out.println("Nhan vien can tim la:");
        for(Employee e : employees) {
            String[] arrName = e.getName().split("\\s");
            ArrayList <String> nameSplit = new ArrayList<>(Arrays.asList(arrName));
            if(nameSplit.contains(name)){
                System.out.println(e.toString());
            }
        }
    }

    public void countGender(ArrayList<Employee> employees){
        int m = 0;
        int f = 0;
        for (Employee e : employees) {
            if(e.getGender()==Gender.Male){
                m = m+1;
            }else{f=f+1;}
        }
        System.out.println("So nhan vien nam la: " + m);
        System.out.println("So nhan vien nu la: " + f);
    }

    public void listByAge(ArrayList<Employee> employees){
        System.out.println("Cac nhan vien tren 30 tuoi la:");
        for(Employee e : employees) {
            LocalDate timeNow = LocalDate.now();
            int age = timeNow.getYear() - e.getBirthDay().getYear();
            if(age>30){
                System.out.println(e.toString());
            }
            
        }
    }

    public void listByMonth(ArrayList<Employee> employees){
        System.out.println("Cac nhan vien sinh nhat thang nay la:");
        for(Employee e : employees) {
            LocalDate timeNow = LocalDate.now();
            if(timeNow.getMonth().equals(e.getBirthDay().getMonth())){
                System.out.println(e.toString());
            }
            
        }
    }

}
