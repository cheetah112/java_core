// import java.util.Random;
// import java.util.Scanner;

// public class Btvn4C3 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         Random rd = new Random();
//         String otp = "Y";
//         do{
//             int rdNumber = rd.nextInt();
//             System.out.println("So random là: " + rdNumber);
//             if(rdNumber < 2){
//                 // System.out.println("So random là: " + rdNumber);
//                 System.out.println("Day khong phai la so nguyen to.");
//                 System.out.println("Ban muon tiep tuc khong? (Y/N)");
//                 sc.nextLine();
//                 otp = sc.nextLine();
//             }else{
//                 int squareRoot = (int) Math.sqrt(rdNumber);
//                 for(int i = 2; i <= squareRoot; i++){
//                     if(rdNumber % i == 0){
//                         System.out.println("Day khong phai la so nguyen to.");
//                         break;
//                     }else{
//                         System.out.println("Day la so nguyen to.");
//                         break;
//                     }
//                 }
//                 System.out.println("Ban muon tiep tuc khong? (Y/N)");
//                 sc.nextLine();
//                 otp = sc.nextLine();    
//             }
//         }
//         while (otp.equals("Y"));
//     }
// }
