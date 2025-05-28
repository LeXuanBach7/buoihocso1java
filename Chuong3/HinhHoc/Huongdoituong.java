package Chuong3.HinhHoc;
import java.util.Scanner;

public class Huongdoituong {

    public static void main(String[] args) throws Exception {
        // 1. Tạo các đối tượng từ khuôn mẫu
        HinhTron ht = new HinhTron();
        HinhTron ht1 = new HinhTron();
        HinhTron ht2 = new HinhTron();
        sinhvien sv = new sinhvien();

        // Đối tượng ht
        ht.nhapBanKinh();
        ht.inToaDo();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.inChuVi();
        ht.inDienTich();
        ht.inHinhTron();

        // Đối tượng ht1
        ht1.nhapBanKinh();
        ht1.tinhChuVi();
        ht1.tinhDienTich();
        ht1.inDienTich(); // Thêm dấu chấm phẩy
        ht1.inChuVi();
        ht1.inHinhTron();

        // Đối tượng ht2
        ht2.nhapBanKinh();
        ht2.tinhChuVi();
        ht2.tinhDienTich();
        ht2.inDienTich();
        ht2.inChuVi();
        ht2.inHinhTron();
        //doi tuong sv
        sv.nhapthongtin();
        System.out.println("Thông tin sinh viên: " + sv.xemthongtin());
    }
}