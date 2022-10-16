package View;

import java.util.Scanner;

public class LogScreen {
    public int logScreen() {
        System.out.println("HELLO!!\nMoi ban lua chon:\n1.Dang Nhap\n2.Dang ky");
        Scanner sc = new Scanner(System.in);
        int otplog = sc.nextInt();
        return otplog;
    }
}
