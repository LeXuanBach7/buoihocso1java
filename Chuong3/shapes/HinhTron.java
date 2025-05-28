package Chuong3.shapes;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    public float banKinh;

    public HinhTron() {
        super("Hình Tròn");
    }

    public void nhapBanKinh() {
        System.out.print("Bán kính = ");
        Scanner sc = new Scanner(System.in);
        banKinh = sc.nextFloat();
    }

    public void tinhChuVi() {
        super.chuVi = 2 * PI * banKinh;
    }

    public void tinhDienTich() {
        super.dienTich = PI * banKinh * banKinh;
    }
}
