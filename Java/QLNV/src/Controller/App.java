package Controller;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import Model.Employee;
import Model.EmployeeModel;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i=0;
        ArrayList<Employee> employees =new ArrayList<>();
        do{
            System.out.println("Moi ban lua chon:\n0.Them nhan vien\n1.Tìm nhân viên theo id \n2.Tìm nhân viên theo tên\n3.Đếm số nhân viên nam, nữ\n4.Liệt kê các nhân viên trên 30 tuổi\n5.Nhập từ bàn phím tháng bất kỳ trong năm; kiểm tra xem trong tháng đó có những nhân viên nào có ngày sinh nhật\n6.In ra top 3 người có lương tháng cao nhất\n7.Thoat ctrinh");
            EmployeeModel employeeModel = new EmployeeModel();
            i =sc.nextInt();
            sc.nextLine();
            switch(i){
                case 0:
                Employee employee = employeeModel.addEmployee(sc);
                employees.add(employee);
                System.out.println(employees.toString());
                break;
                case 1: employeeModel.searchByid(employees, sc);
                break;
                case 2: employeeModel.searchByName(employees, sc);
                break;
                case 3: employeeModel.countGender(employees);
                break;
                case 4: employeeModel.listByAge(employees);
                break;
                case 5: employeeModel.listByMonth(employees);
                break;
                case 6:

                break;
                case 7: i=7;
                break;
            }
        }while(i!=7);

}
}