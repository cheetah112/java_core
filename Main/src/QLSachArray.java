import java.util.Scanner;

public class QLSachArray {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("MENU\n1.Them sach.\n2.Tim sach.\n3.List sach.\nMoi ban chon thao tac:");
    int otp = sc.nextInt();
    int c = 3 ;
    String array [][] = new String[c][6];
    array[0][0] = "A1";
    array[0][1] = "Conan";
    array[0][2] = "Aoyama Gosho";
    array[0][3] = "Trinh Tham";
    array[0][4] = "Kim Dong";
    array[0][5] = "2020";
    array[1][0] = "A2";
    array[1][1] = "Doraemon";
    array[1][2] = "Fujiko Fujio";
    array[1][3] = "Thieu Nhi";
    array[1][4] = "Kim Dong";
    array[1][5] = "1997";
    array[2][0] = "A3";
    array[2][1] = "Naruto";
    array[2][2] = "Masashi Kishimoto";
    array[2][3] = "Thieu Nhi";
    array[2][4] = "NXB Tre";
    array[2][5] = "1999";
    switch(otp){
        case 1:
        c = c+1;
        System.out.println("Nhap ma sach:");
        sc.nextLine();
        array[c-1][0] = sc.nextLine();
        System.out.println("Nhap ten sach: ");
        array[c-1][1] = sc.nextLine();
        System.out.println("Nhap ten tac gia: ");
        array[c-1][2] = sc.nextLine();
        System.out.println("Nhap the loai: ");
        array[c-1][3] = sc.nextLine();
        System.out.println("Nhap nha xuat ban: ");
        array[c-1][4] = sc.nextLine();
        System.out.println("Nhap nam xuat ban: ");
        array[c-1][5] = sc.nextLine();
        break;
        case 2:
        System.out.println("Ban muon tim sach theo tieu chi nao:\n1.Theo ten.\n2.Thep the loai.\nMoi ban chon:");
        int otp2 = sc.nextInt();
        switch(otp2){
            case 1:
            System.out.println("Moi ban nhap ten sach:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Sach do la:");
            for(int i=0; i<c; i++ ){
                if(name.equals(array[i][1])){
                    System.out.println(array[i][0] +"\t"+array[i][1]+"\t"+array[i][2]+"\t"+array[i][3]+"\t"+array[i][4]+"\t"+array[i][5]);
                }
            }
            break;
            case 2:
            System.out.println("Moi ban nhap the loai sach:");
            sc.nextLine();
            String type = sc.nextLine();
            System.out.println("Sach do la:");
            for(int i = 0; i<c; i++ ){
                if(type.equals(array[i][3])){
                    System.out.println(array[i][0] +"\t"+array[i][1]+"\t"+array[i][2]+"\t"+array[i][3]+"\t"+array[i][4]+"\t"+array[i][5]);
                }
            }
            break;
        }
        break;
        case 3:
        System.out.println("List sach theo nam: ");
        sc.nextLine();
        String year = sc.nextLine();
        System.out.println("Danh sach sach xuat ban trong nam " + year +" la :");
        for(int i = 0; i<c; i++ ){
            if(year.equals(array[i][5])){
                System.out.println(array[i][0] +"\t"+array[i][1]+"\t"+array[i][2]+"\t"+array[i][3]+"\t"+array[i][4]+"\t"+array[i][5]);
            }
        }
        break;
        }
        System.out.println("\n\nList sach:");
        for(int i = 0; i<c; i++){
            System.out.println(array[i][0] +"\t"+array[i][1]+"\t"+array[i][2]+"\t"+array[i][3]+"\t"+array[i][4]+"\t"+array[i][5]);
        }
    }
}
