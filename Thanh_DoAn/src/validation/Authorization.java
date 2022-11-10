package validation;

import model.Account;
import services.*;


public class Authorization {
    AdminService adminService = new AdminService();
    ManageService manageService = new ManageService();
    EmployeePCBService employeePCBService = new EmployeePCBService();
    EmployeeWIPService employeeWIPService = new EmployeeWIPService();
    EmployeeFontService employeeFontService = new EmployeeFontService();
    ReceptionistService receptionistService = new ReceptionistService();
    EmployeeSoftwareService employeeSoftwareService = new EmployeeSoftwareService();
    EmployeeWareHouseSercive employeeWareHouseSercive = new EmployeeWareHouseSercive();

    // phân quyền login
    public void authorize(Account acc) {
        switch (acc.getType()) {
            case ADMIN:
                adminService.showFunction();
                break;
            case NHANVIENLETAN:
                receptionistService.showFunction();
                break;
            case QUANLY:
                manageService.showFunction();
                break;
            case NHANVIENSUAFONT:
                employeeFontService.showFunction();
                break;
            case NHANVIENSUAPCB:
                employeePCBService.showFunction();
                break;
            case NHANVIENSUAPHANMEM:
                employeeSoftwareService.showFunction();
                break;
            case NHANVIENWIP:
                employeeWIPService.showFunction();
                break;
            case NHANVIENKHO:
                employeeWareHouseSercive.showFunction();
                break;
        }
    }


}
