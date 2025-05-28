package BaiTapCuoiChuong4;
import java.util.Scanner;
public class SinhVien {
    private String Ten;
    private double Diem;

    public SinhVien(String ten, double diem) {
        this.Ten = ten;
        this.Diem = diem;
    }

    public String getTen() {
        return Ten;
    }

    public double getDiem() {
        return Diem;
    }

    public void hienThi() {
        System.out.println("Tên: " + Ten + ", Điểm: " + Diem);
    }
}
