package shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;

    public HinhChuNhat() {
        super("Hình Chữ Nhật");
    }

    public void nhapChieuDai() {
        System.out.print("Chiều dài = ");
        Scanner sc = new Scanner(System.in);
        dai = sc.nextFloat();
    }

    public void nhapChieuRong() {
        System.out.print("Chiều rộng = ");
        Scanner sc = new Scanner(System.in);
        rong = sc.nextFloat();
    }

    public void tinhChuVi() {
        super.chuVi = 2 * (dai + rong);
    }

    public void tinhDienTich() {
        super.dienTich = dai * rong;
    }
}
