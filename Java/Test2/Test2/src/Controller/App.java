package Controller;
import java.util.ArrayList;
import java.util.Scanner;

import Model.User;
import Model.UserModel;
import View.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        LoginScreen login = new LoginScreen();
        LogScreen logScreen = new LogScreen();
        UserModel userModel = new UserModel();
        ArrayList<User> users = new ArrayList<>();
        int i = 0;
        do{
            logScreen.logScreen();       
            i = sc.nextInt();
            
            //option - Dang ky tai khoan. 
            if(i == 2){            
                User user = userModel.registerUser(users);
                if(userModel.checkEmail(users, user)){
                }else{
                    if(userModel.checkUsername(users, user)){
                        System.out.println("UserName da duoc su dung.");
                    }else{
                        if(userModel.checkPass(user)){
                        users.add(user);
                        //In Users de check code.
                        //System.out.println(users.toString());  
                            }
                        }
                }
            }
            
            //option - Dang nhap.
            else if (i == 1){    
            User u = userModel.login(users);
            if(u == null){

                }
                else{
                    int j = sc.nextInt();
                if(j==1){
                    userModel.changeUsername(users, u);
                    }else if(j==2){
                    userModel.changeEmail(users, u);
                    }else if(j==3){
                    userModel.changePassword(u);
                    }else if(j==4){

                    }else if(j==0){
                    i=0;
                    }
                }
            }
        }while(i != 0);
    }
}  