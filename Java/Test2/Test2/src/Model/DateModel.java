package Model;

import java.util.Scanner;

public class DateModel {
    Scanner sc = new Scanner(System.in);
    Data data = new Data();
    public int login() {
        int h = 0;
        System.out.println("Moi ban nhap username: ");
        String n = sc.nextLine();
        for(int i=0; i<data.getData().size() ; i++){
        if(data.getData().get(i).getUsername().equals(n)){
            System.out.println("Moi ban nhap password:");
           String p = sc.nextLine();
            if(data.getData().get(i).getPassword().equals(p)){
                h = 1;
            }else{
                System.out.println("Sai mat khau!");
                h = 2;
            }
        }else {
            System.out.println("Kiểm tra lại username");
            h = 3;
        }
    }
        return h ;
    }
    
    public boolean fogotPass () {
        System.out.println("Nhap email: ");
        String email = sc.nextLine();
        for(int i=0; i<data.getData().size() ; i++){
            if(data.getData().get(i).getEmail().equals(email)){
                return true;                
}
    }
        return false;
}
    public void changeUsername() {
        int index = data.getData().indexOf(data);
        System.out.println("Username moi ban muon thay doi la: ");
        data.getData().get(index).setUsername(sc.nextLine());
    }

    public void changeEmail() {
        int index = data.getData().indexOf(data);
        System.out.println("Email moi ban muon thay doi la: ");
        data.getData().get(index).setEmail(sc.nextLine());
}
    public void changePass() {
    int index = data.getData().indexOf(data);
    System.out.println("Pass moi ban muon thay doi la: ");
    data.getData().get(index).setPassword(sc.nextLine());
}
}


