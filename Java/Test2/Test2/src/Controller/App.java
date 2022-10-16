package Controller;
import java.util.ArrayList;
import java.util.Scanner;

import Model.Data;
import Model.DateModel;
import Model.User;
import Model.UserModel;
import View.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        LogScreen logScreen = new LogScreen();
        UserModel userModel = new UserModel();
        ArrayList<User> users = new ArrayList<>();
        Data data = new Data();
        DateModel dateModel = new DateModel();
        do{
        switch(logScreen.logScreen()){
            case 1:
            do{
                switch(dateModel.login()){
                    case 1: System.out.println("1");
                    break;
                    case 2: System.out.println("2");
                    break;
                    case 3: System.out.println("3");
                    break;
                }}
            while(dateModel.login()!=0);
            break;
            case 2:
            User user = userModel.registerUser();
            users.add(user);
            data.setData(users);   
            break; 
            case 3:
            System.out.println(data.toString());
            System.out.println(data.getData().size()); 
            break;    
        }
    }while(logScreen.logScreen()==1|logScreen.logScreen()==2|logScreen.logScreen()==3);

        }
        
        // LoginScreen loginScreen = new LoginScreen();
        // loginScreen.loginScreen();
    }
