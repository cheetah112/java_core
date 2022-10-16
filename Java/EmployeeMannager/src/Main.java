import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Tạo scanner
        Scanner sc = new Scanner(System.in);

        //Tạo Mảng nhân viên.
        Employee nv1 =new Employee("NV01", "Nguyen Van A", LocalDate.of(1998, 5, 15), 6000000 ,GENDER.MALE);
        Employee nv2 =new Employee("NV02", "Nguyen Huyen B", LocalDate.of(1996, 9, 25), 8000000 ,GENDER.FEMALE);
        Employee nv3 =new Employee("NV03", "Nguyen Hoang C", LocalDate.of(1995, 8, 12), 5000000 ,GENDER.MALE);
        Employee nv4 =new Employee("NV04", "Ta Doan D", LocalDate.of(1997, 5, 28), 9000000 ,GENDER.MALE);
        Employee nv5 =new Employee("NV05", "Vu Thi E", LocalDate.of(1998, 2, 20), 6000000 ,GENDER.MALE);
        
        //Tìm nhân viên theo id.
        Employee employee [] = {nv1,nv2,nv3,nv4,nv5};
        // System.out.println("Nhap ma nhan vien can tim(VD: NV01): ");
        // String n = sc.nextLine();
        // for(int i=0; i < employee.length; i++){
        //     if(employee[i].getId().equals(n)){
        //         System.out.println("Id: " + employee[i].getId() +"\tName: " + employee[i].getName() + "\tBirthDay: " + employee[i].getBirthdDay() + 
        //         "\tSalary: " + employee[i].getSalary() + "\tGender: " + employee[i].getGender());
        //     }
        // }

        //Tìm nhan vien theo ten.
        //Dem so nhan vien nam nu
        int sumM = 0;
        int sumFM = 0;
        for(int i=0; i < employee.length; i++){
            if(employee[i].getGender().equals("MALE")){
                sumM = sumM + 1;
            }else{
                sumFM = sumFM+1;
            }
    }
    System.out.println(sumM);
    System.out.println(sumFM);
}
}
