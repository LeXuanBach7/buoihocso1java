package shapes;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong() {
        super();
        ten = "Hình Vuông";
    }

    public void nhapCanh() {
        System.out.print("Cạnh = ");
        Scanner sc = new Scanner(System.in);
        dai = rong = sc.nextFloat();
    }
}
