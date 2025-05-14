package HinhHoc;
import java.util.Scanner;
public class ToaDo {
    // Khai báo thuộc tính
    private float x;
    private float y;
    // Phương thức nhập tọa độ
    public void nhapToaDo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tọa độ x: ");
        x = sc.nextFloat();
        System.out.print("Nhập tọa độ y: ");
        y = sc.nextFloat();
    }
    // Phương thức in tọa độ
    public void inToaDo() {
        System.out.println("Tọa độ là: (" + x + ", " + y + ")");
    }
    
}
