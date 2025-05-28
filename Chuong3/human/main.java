package Chuong3.human;
import java.util.Scanner;
public class main {
    public static void main(String[] args) throws Exception {
        Xemay xe = new Xemay();
        Xemay xe1 = new Xemay();
  
        xe.nhapThongTin();
        xe.hienThiThongTin();
        xe.kiemTraXe();
        xe.giamGia(10);

        xe1.nhapThongTin();
        xe1.hienThiThongTin();
        xe1.kiemTraXe();
        xe1.giamGia(10);
    }
}
