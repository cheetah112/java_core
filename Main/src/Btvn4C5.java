// import java.util.Scanner;

// public class Btvn4C5 {
//     public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Nhap so dong cua a: ");
//     int da = sc.nextInt();
//     System.out.println("Nhap so cot cua a: ");
//     int ca = sc.nextInt();
//     int arra [][] = new int[da][ca];
//     for(int i = 0; i < da; i++ ){
//         for(int j = 0; j< ca; j++){
//             System.out.print("Nhap a[" + i + "][" + j + "] :");
//             arra[i][j] = sc.nextInt();
//         }
//     }
//     System.out.println("Mang 2 chieu a la : ");
//     for(int i = 0; i < da; i++ ){
//         for(int j = 0; j< ca; j++){
//             System.out.print(arra[i][j] + "\t");
//         }
//         System.out.println("\n");
//     }
//     System.out.println("Cac phan tu trong duong cheo chinh la: ");
//     for(int i = 0; i < da; i++ ){
//         for(int j = 0; j< ca; j++){
//             if(i==j){
//             System.out.print(arra[i][j] + "\t");
//             }
//         }
//         }
//     System.out.println("\nTao them mang 2 chieu cung so dong vs cot cua mang a la:");
//     int arrb [][] = new int[da][ca];
//     for(int i = 0; i < da; i++ ){
//         for(int j = 0; j< ca; j++){
//             System.out.print("Nhap b[" + i + "][" + j + "] :");
//             arrb[i][j] = sc.nextInt();
//         }
//     }
//     System.out.println("Cong 2 mang ta co ket qua la: ");
//     int array [][] = new int [da][ca];
//     for(int i = 0; i < da; i++ ){
//         for(int j = 0; j< ca; j++){
//             array[i][j] = arra[i][j] + arrb[i][j];
//             System.out.print(array[i][j] + "\t");
//         }
//         System.out.println("\n");
//     }
//     }
// }
