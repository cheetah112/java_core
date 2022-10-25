import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StudentModel studentModel = new StudentModel();
        ArrayList<Student> students = new ArrayList<>();
        int i = 1;
        do{
            switch(i){
                case 1:
                Student student = studentModel.inpuStudent(sc);
                studentModel.rankStudent(student);
                students.add(student);
                System.out.println("Ban muon tiep tuc nhap khong (1.Co - 2.Khong): ");
                i = sc.nextInt();
                break;
            }
        }while(i!=2);
        System.out.println("Danh sach hoc sinh:");
        for(Student s : students){
            System.out.println("Id: " + s.getId() + "\t Name: " + s.getName() + "\t AVGScore: " + s.getAvgScore() + "\t Rank: " + s.getRank());
        }
        studentModel.calper(students);          
    }
}
