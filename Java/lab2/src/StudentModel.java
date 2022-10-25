import java.util.ArrayList;
import java.util.Scanner;

public class StudentModel {
    public Student inpuStudent(Scanner sc){
        Student student = new Student();
        System.out.println("Nhap thong tin hoc sinh:\n1.Id:");
        student.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("2.Name: ");
        student.setName(sc.nextLine());
        System.out.println("3.ScoreMath: ");
        student.setScoreMath(sc.nextDouble());
        System.out.println("4.ScorePhysic: ");
        student.setScorePhysic(sc.nextDouble());
        System.out.println("5.ScoreChemistry: ");
        student.setScoreChemistry(sc.nextDouble());

        return student;

    }
    public void rankStudent(Student student){
        student.setAvgScore((student.getScoreMath()+student.getScoreChemistry()+student.getScorePhysic())/3);
        if(student.getAvgScore()>=8){
            student.setRank("A");
        }else if(student.getAvgScore()>=6.5){
            student.setRank("B");
        }else {
            student.setRank("C");
        }
    }
    public void calper(ArrayList<Student> students){
        double sumA = 0;
        double sumB = 0;
        double sumC = 0;
        for(Student s: students){
            if(s.getRank().equals("A")){
                sumA = sumA +1;
            }else if(s.getRank().equals("B")){
                sumB = sumB +1;
            }else{
                sumC = sumC +1;
            }
        }
        System.out.println("Ty le hoc sinh:\n Xep hang A: " + (sumA/(sumA+sumB+sumC))*100 +"%\n Xep hang B: " + (sumB/(sumA+sumB+sumC))*100 +"%\n Xep hang C: " + (sumC/(sumA+sumB+sumC))*100 +"%");
    }
}
