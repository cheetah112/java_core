// import java.util.Scanner;

// public class Btvn3 {
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("\t MENU \n1. Giai phuong trinh bac nhat\n2. Giai phuong trinh bac 2\n3. Tinh tien dien\n4. Ket thuc.\n\nCHON CHUC NANG: ");
//     int otp = sc.nextInt();
//     switch(otp){
//         case 1:
//         System.out.println("Nhap a: ");
//         double a = sc.nextDouble();
//         System.out.println("Nhap b: ");
//         double b = sc.nextDouble();
//         if(a==0 && b==0){
//             System.out.println("Phuong trinh co vo so nghiem.");
//         }else if(a==0 && b!=0){
//             System.out.println("Phuong trinh vo nghiem.");
//         }
//         else{
//             System.out.println(" phuong trinh co nghiem la: "+(-b/a));
//         }
//         break;
//         case 2:
//         System.out.println("Nhap a: ");
//         a = sc.nextDouble();
//         System.out.println("Nhap b: ");
//         b = sc.nextDouble();
//         System.out.println("Nhap c: ");
//         double c = sc.nextDouble();
//         if(a==0) {
//             if(b==0 && c==0){
//                 System.out.println("Phuong trinh co vo so nghiem.");
//             } else if (b==0 & c!=0) {
//                 System.out.println("Phuong trinh vo nghiem");
//             } else {
//                 System.out.println("Phuong trinh co 1 nghiem la: " + (-c/b));
//             }
//         }
//         else { 
//             double delta = (b*b)-(4*a*c);
//             if(delta < 0) {
//                 System.out.println(" Phuong trinh vo nghiem");
//             } else if (delta == 0) {
//                 System.out.println("Phuong trinh co nghiem kep la: " + (-b/a));
//             }
//             else {
//                 System.out.println("Phuong trinh co 2 nghiem la: x1= " + (-b-Math.sqrt(delta))/(2*a) + "/n x2= " + (-b+Math.sqrt(delta))/(2*a));
//             }
//         }
//         break;
//         case 3:
//         System.out.println("Nhap so dien: ");
//         double quantity = sc.nextDouble();
//         if(quantity < 50){
//             System.out.println("Tien dien la: " + (quantity * 1000) + " VND");
//         }else {
//             System.out.println("Tien dien la: " + ((50*1000)+((quantity-50)*1200)));
//         }
//         break;
//         case 4:
//         break;
//     }    
//     }
// }
