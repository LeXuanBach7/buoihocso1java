package Chuong3.HinhHoc;
import java.util.Scanner;

public class HinhTron {
    // Khai báo thuộc tính
    private float banKinh;
    final float PI = 3.14f;
        float cv;
        float dt;
        ToaDo toaDo;
    // Phương thức nhập bán kính
    public void nhapBanKinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính hình tròn: ");
        banKinh = sc.nextFloat();
        toaDo = new ToaDo(); // Khởi tạo đối tượng ToaDo
        toaDo.nhapToaDo(); // Nhập tọa độ

    }

    // Phương thức tính chu vi
    void tinhChuVi() {
        cv = 2 * PI * banKinh;
    }
    // Phương thức tính diện tích
    void tinhDienTich() {
        dt = PI * banKinh * banKinh;
    }
    //in chu vi
    public void inChuVi() {
        System.out.println("Chu vi hình tròn là: " + cv);
    }
    //in diện tích
    public void inDienTich() {
        System.out.println("Diện tích hình tròn là: " + dt);
    }
    public void inToaDo() {
        System.out.println("Tọa độ hình tròn là: ");
        toaDo.inToaDo(); // In tọa độ
    }
    public void inHinhTron() {
        System.out.println("Hình tròn có bán kính: " + banKinh);
        inChuVi();
        inDienTich();
        inToaDo(); // In tọa độ
    }
}



    