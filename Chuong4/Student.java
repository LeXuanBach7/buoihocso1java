package Chuong4;

import java.util.Scanner;

public class Student {
    public String ten; // Thuộc tính tên sinh viên
    public String maSV; // Thuộc tính mã sinh viên
     //phuong thuc khoi tao ko tham so
    public Student() {
        this.ten = ""; // Khởi tạo tên sinh viên rỗng
        this.maSV = ""; // Khởi tạo mã sinh viên rỗng
    }
    // Phương thức nhập tên và mã sinh viên
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sinh vien: ");
        ten = sc.nextLine(); // Gán giá trị trực tiếp cho thuộc tính `ten`
        System.out.print("Nhap ma sinh vien: ");
        maSV = sc.nextLine(); // Gán giá trị trực tiếp cho thuộc tính `maSV`
    }

    // Phương thức hiển thị thông tin sinh viên
    public void displayData() {
        System.out.println("Thong tin sinh vien: ");
        System.out.println("Ten: " + ten);
        System.out.println("Ma sinh vien: " + maSV);
    }
}
