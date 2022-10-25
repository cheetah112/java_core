import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static int id=0;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StudentModel studentModel =new StudentModel();
        ArrayList<Student> students = new ArrayList<>();
        int i = 1 ;
        do{
            switch(i){
                case 1:
                Student student = studentModel.inputStudent(sc);
                student.setId(id+1);
                students.add(student);
                System.out.println("Ban muon tiep tuc khong(1.Co - 2.Khong)");
                i = sc.nextInt();
                sc.nextLine();
                id=id+1;
                break;
                case 2: 
                i = 2;
                break;
            }
        }while(i!=2);
        System.out.println("Danh sach hoc sinh la:");
        for(Student s : students){
            System.out.println("Id: " + s.getId() + " - Name: " + s.getName() + " - Dia chi: " + s.getAddress());
        }
    }
}
 