package utils;

import java.util.Iterator;
import java.util.List;

import database.DataBase;
import model.Account;
import model.Employee;
import model.History;
import model.Invoice;

public class SearchHistory {
    
    public static <E> void searchAll(List<E> list){
        for(E e: list){
            System.out.println(e.toString());
        }
    }
    
    public static void searchProductById(){
        Iterator<History> it = DataBase.historyList.iterator();
        System.out.println("Nhap ID product:");
        String idProduct = InputValue.getString();
        while(it.hasNext()){
            History history = it.next();
            if(idProduct.equals(history.getProduct().getIdProduct())){
                System.out.println(history.toString());
            }
        }
    }

    public static void searchCustomerByID(){
        Iterator<Invoice> it = DataBase.invoiceList.iterator();
        System.out.println("Nhap ID Customer:");
        String idCustomer = InputValue.getString();
        while(it.hasNext()){
            Invoice invoice = it.next();
            if(idCustomer.equals(invoice.getCustomer().getIdCustomer())){
                System.out.println(invoice.toString());
            }
        }
    }

    public static void searchInvoiceByID(){
        Iterator<Invoice> it = DataBase.invoiceList.iterator();
        System.out.println("Nhap ID Invoice:");
        String idInvoice = InputValue.getString();
        while(it.hasNext()){
            Invoice invoice = it.next();
            if(idInvoice.equals(invoice.getCodeInvoive())){
                System.out.println(invoice.toString());
            }
        }
    }

    public static void searchAccountByID(){
        Iterator<Account> it = DataBase.accountsList.iterator();
        System.out.println("Nhap ID Account:");
        String idAccount = InputValue.getString();
        while(it.hasNext()){
            Account account = it.next();
            if(account.getUserName().equals(idAccount)){
                System.out.println(account.toString());
            }
        }
    }

    public static void searchEmployeeByID(){
        Iterator<Employee> it = DataBase.employeeList.iterator();
        System.out.println("Nhap ID Employee:");
        String idEmployee = InputValue.getString();
        while(it.hasNext()){
            Employee employee = it.next();
            if(employee.getIdNhanVien().equals(idEmployee)){
                System.out.println(employee.toString());
            }
        }
    }

    public static void searchCustomerByName(){
        Iterator<Invoice> it = DataBase.invoiceList.iterator();
        System.out.println("Nhap Name Customer:");
        String name = InputValue.getString();
        while(it.hasNext()){
            Invoice invoice = it.next();
            if(invoice.getCustomer().getNameCustomer().contains(name)){
                System.out.println(invoice.toString());
            }
        }
    }
}
