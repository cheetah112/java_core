package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Tạo 1 list book
        Book book = new Book(1,"sach1","author1","subtitle1",4);
        Book book2 = new Book(2,"sach2","author2","subtitle2",0);
        List<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book2);

        //Tạo list reader
        Reader reader = new Reader(1,"Name1","address1","phone1");
        Reader reader2 = new Reader(2,"Name2","address2","phone2");
        List<Reader> readers = new ArrayList<>();
        readers.add(reader);
        readers.add(reader2);

        //Tạo 1 list
        TicketBook ticketBook = new TicketBook(reader,book);
        TicketBook ticketBook2 = new TicketBook(reader2,book2);
        List<TicketBook> ticketBooks = new ArrayList<>();
        ticketBooks.add(ticketBook);
        ticketBooks.add(ticketBook2);

        //Test insert book
        System.out.println("Đầu tiên test chức năng insert book nè ...");
        System.out.println("Nhập tên nhanh hộ cái:");
        String name= scanner.nextLine();
        System.out.println("Nhập tên tác giả đi:");
        String auth= scanner.nextLine();
        System.out.println("Rồi nhập tiêu đề đi:");
        String title= scanner.nextLine();
        BookModel model = new BookModel();
        Book book3 = new Book(3,name,auth,title,2);
        model.insert(book3,books);

        //Test update book
        System.out.println("Giờ test chức năng update book nè ...");
        System.out.println("Nhập tên nhanh hộ cái:");
        String name4= scanner.nextLine();
        System.out.println("Nhập tên tác giả đi:");
        String auth4= scanner.nextLine();
        System.out.println("Rồi nhập tiêu đề đi:");
        String title4= scanner.nextLine();
        Book book4 = new Book(3,name4,auth4,title4,4);
        model.update(book4,books);

        //Test delete book
        System.out.println("Giờ test chức năng delete chứ j ...");
        System.out.println("Nhập id muốn delete nào");
        int id = scanner.nextInt();
        Book book5 = new Book(id);
        model.delete(book5, books);

        //================================================
        //Test insert Reader
        System.out.println("Đầu tiên test chức năng insert Reader nè ...");
        System.out.println("Nhập tên nhanh hộ cái:");
        String nameR= scanner.nextLine();
        System.out.println("Nhập tên tác giả đi:");
        String address= scanner.nextLine();
        System.out.println("Rồi nhập tiêu đề đi:");
        String phone= scanner.nextLine();
        ReaderModel readerModel = new ReaderModel();
        Reader reader3 = new Reader(3,name,address,phone);
        readerModel.insert(reader3,readers);

        //Test update reader
        System.out.println("Giờ test chức năng update reader nè ...");
        System.out.println("Nhập tên nhanh hộ cái:");
        String nameR3= scanner.nextLine();
        System.out.println("Nhập địa chỉ đi:");
        String address3= scanner.nextLine();
        System.out.println("Rồi nhập phone đi:");
        String phone3= scanner.nextLine();
        Reader reader4 = new Reader(3,nameR3,address3,phone3);
        readerModel.update(reader4,readers);

        //Test delete reader
        System.out.println("Giờ test chức năng delete chứ j ...");
        System.out.println("Nhập id muốn delete nào");
        int idDel = scanner.nextInt();
        Reader reader5 = new Reader(idDel);
        readerModel.delete(reader5, readers);
    }
}
