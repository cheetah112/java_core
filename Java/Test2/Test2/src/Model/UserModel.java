package Model;

import java.util.Scanner;

public class UserModel {
    Scanner sc = new Scanner(System.in);
    public User registerUser() {
        User user = new User();
        System.out.println("Moi ban nhap email: ");
        String email = sc.nextLine();
        System.out.println("Nhap username: ");
        String username = sc.nextLine();
        System.out.println("Moi ban nhap password:");
        String password = sc.nextLine();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        return user;
    }
    
}
