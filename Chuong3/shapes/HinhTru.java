package Chuong3.shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float chieuCao;

    public HinhTru() {
        super();  // gọi constructor của HinhTron
        ten = "Hình Trụ";
    }

    public void nhapChieuCao() {
        System.out.print("Chiều cao = ");
        Scanner sc = new Scanner(System.in);
        chieuCao = sc.nextFloat();
    }

    public void tinhTheTich() {
        super.theTich = super.dienTich * chieuCao;
    }
}

