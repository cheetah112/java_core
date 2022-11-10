package services;

import database.DataBase;
import model.Account;
import model.Employee;
import utils.InputValue;
import validation.Authentication;
import validation.Authorization;

public class Login {
    Authentication authentication = new Authentication();
    Authorization authorization = new Authorization();

    public void showLogin() {
        while (true) {
            System.out.println("Nhập tài khoản");
            String account = InputValue.getString();
            System.out.println("Nhập mật khẩu");
            String password = InputValue.getString();
            if (DataBase.accountsList.isEmpty()) {
                System.err.println("Chưa có tài khoản nào. Mời bạn đăng ký trước");
                break;
            }

            Account acc = authentication.login(account, password);

            if (acc == null) {
                System.out.println("Bạn đã nhập sai tài khoản hoặc mật khẩu!!! vui lòng nhập lại ");
            } else {
                DataBase.employee = InputValue.getOneEmployee(account);
                authorization.authorize(acc);
            }
        }
    }
}
