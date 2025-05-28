package Chuong3.human;
import java.util.Scanner;

public class Xemay {
    String hangxe;
    float giaban;
    int namsx;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hãng xe: ");
        hangxe = sc.nextLine();
        System.out.print("Nhập giá bán: ");
        giaban = sc.nextFloat();
        System.out.print("Nhập năm sản xuất: ");
        namsx = sc.nextInt();
    }

    public void hienThiThongTin() {
        System.out.println("Thông tin xe máy:");
        System.out.println("Hãng xe: " + hangxe);
        System.out.println("Giá bán: " + giaban+ "trieu dong");
        System.out.println("Năm sản xuất: " + namsx);
    }

    // kiểm tra xe cũ hay mới
    public void kiemTraXe() {
        int namHienTai = 2025;
        if (namHienTai - namsx > 5) {
            System.out.println("Xe này là xe cũ.");
        } else {
            System.out.println("Xe này là xe mới.");
        }
    }

    // giảm giá xe
    public void giamGia(float phanTram) {
        giaban -= giaban * (phanTram / 100);
        System.out.println("Giá bán sau khi giảm " + phanTram + "% là: " + giaban+ " trieu dong");
    }

    public static void main(String[] args) {
        Xemay xe = new Xemay();

        xe.nhapThongTin();

        xe.hienThiThongTin();

        xe.kiemTraXe();

        xe.giamGia(10);
    }
}
