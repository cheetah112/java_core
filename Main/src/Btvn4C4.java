// public class Btvn4C4 {
//     public static boolean isPrimeNumber(int n) {
//         if (n < 2) {
//         return false;
//         }
//         int squareRoot = (int) Math.sqrt(n);
//         for (int i = 2; i <= squareRoot; i++) {
//         if (n % i == 0) {
//         return false;
//         }
//         }
//         return true;
//        }
//     public static void main(String[] args){ 
//     int sumn = 0;
//     int n = 2;
//     System.out.println("10  so nguyen to dau tien la:"); 
//         while (sumn <=10){
//             if(isPrimeNumber(n)) {
//                 System.out.print(n + "\t");
//                 sumn=sumn+1;
//             }
//             n=n+1;
//     }
//     System.out.println("\nCac so nguyen to nho hon 10 la:");
//     for(n=2; n<10; n++){
//         if(isPrimeNumber(n)) {
//             System.out.print(n + "\t");
//         }
//     }
// }
// }