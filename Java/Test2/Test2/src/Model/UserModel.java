package Model;

import java.util.ArrayList;
import java.util.Scanner;
import Model.EmailExample;
import View.LoginScreen;
import View.WrongPass;

public class UserModel {
    
    //Tao Scanner
    Scanner sc = new Scanner(System.in);
    
    //Chuc Nang register.
    public User registerUser(ArrayList<User> users) {
        User user = new User();
        System.out.println("Moi ban nhap email: ");
        String email =  sc.nextLine();
        System.out.println("Nhap username: ");
        String username = sc.nextLine();
        System.out.println("Moi ban nhap password:");
        String password = sc.nextLine();
        user.setPassword(password);
        user.setUsername(username);
        user.setEmail(email);
        return user;
    }
    
    //Chuc Nang Login
    public User login(ArrayList<User> users){
        System.out.println("Moi ban nhap Username: ");
        String username = sc.nextLine();
        System.out.println("Moi ban nhap Pass: ");
        String pass = sc.nextLine();
        for(User u : users){
            if(username.equals(u.getUsername())){
                if(pass.equals(u.getPassword())){
                    System.out.println("Chao mung " +u.getUsername()+ " ,ban co the thuc hien cac cong viec sau:");
                    LoginScreen login = new LoginScreen();
                    login.loginScreen();
                    return u;
                }else {
                    System.out.println("Sai mat khau");
                    WrongPass wrongPass = new WrongPass();
                    wrongPass.wrongPass();
                    int i = sc.nextInt();
                    if(i == 1){
                       sc.nextLine(); 
                    }else if(i == 2){
                    System.out.println("Nhap email: ");
                    sc.nextLine();
                    String email = sc.nextLine();
                    if(email.equals(u.getEmail())){
                        changePassword(u);
                    }else{
                        System.out.println("Chua ton tai tai khoan.");
                    }
                    }
                }
            }
                else {
                    System.out.println("Kiem tra lai username.");
                }   
            }
        return null ;
    }

        //Chuc Nang ChagePassword
        public void changePassword(User user){
            System.out.println("Moi ban nhap mat khau moi: ");
            String pass = sc.nextLine();
            PassExample passExample = new PassExample();
            if(passExample.validatePass(pass)){            
                user.setPassword(pass);
                System.out.println("Doi mat khau thanh cong");
            }else{
                System.out.println("Dinh dang Password bi sai.\nPassword dai tu 7 đen 15 ky tu, chua it nhat 1 ky tu in hoa, 1 ky tu đac biet (@ # $ % ^ & + =)");
            }

        }

        //Chuc Nang ChangeUserName
        public void changeUsername(ArrayList<User> users, User user){
            System.out.println("Moi ban nhap Username moi: ");
            String username = sc.nextLine();
            ArrayList<String> userNames = new ArrayList<>();
            for(User u : users){
                userNames.add(u.getUsername());
            }
            if(userNames.contains(username)){
                System.out.println("UserName da ton tai");
            }else{user.setUsername(username);
                System.out.println("Doi Usernam thanh cong");}
        }
        
        //Chuc Nang ChangeEmail
        public void changeEmail(ArrayList<User> users, User user){
            System.out.println("Moi ban nhap email moi: ");
            String email = sc.nextLine();
            EmailExample emailExample = new EmailExample();
            if(emailExample.validate(email)){ 
                ArrayList<String> emails = new ArrayList<>();
                for(User u : users){
                    emails.add(u.getEmail());
                }
                if(emails.contains(email)){
                    System.out.println("Email da ton tai");
                }else{user.setEmail(email);
                    System.out.println("Doi email thanh cong");}
            }else{
                System.out.println("Dinh dang Email bi sai.\nEmail phai co dang yyy@yyy.yyy.");
            }
        }    
        
        //Chuc Nang CheckUserName
        public boolean checkUsername(ArrayList<User> users, User user){
            ArrayList<String> userNames = new ArrayList<>();
            for(User u : users){
                userNames.add(u.getUsername());
            }
            if(userNames.contains(user.getUsername())){
                return true;
            }
            return false;
        }

        //Chuc Nang CheckEmail
        public boolean checkEmail(ArrayList<User> users, User user){
            EmailExample emailExample = new EmailExample();
            if(emailExample.validate(user.getEmail())){ 
            ArrayList<String> emails = new ArrayList<>();
            for(User u : users){
                emails.add(u.getUsername());
            }
            if(emails.contains(user.getEmail())){
                System.out.println("Email da duoc su dung.");
                return true;
            }
            }else{
            System.out.println("Dinh dang email sai\n Email phai co dang yyy@yyy.yyy.");
            return true;
            }
            return false;
        }

        //Chuc Nang CheckPass
        public boolean checkPass(User user){
            PassExample passExample = new PassExample();
            if(passExample.validatePass(user.getPassword())){
                return true;
            }
            System.out.println("Dinh dang Password sai.\nPassword dai tu 7 đen 15 ky tu, chua it nhat 1 ky tu in hoa, 1 ky tu đac biet (@ # $ % ^ & + =)");
            return false;
        }
    }       