package Chuong3.model;
import Chuong3.model.*;
import util.Configs;

public class Main {
    public static void main(String[] args) {
        NhanVienFullTime sep = new NhanVienFullTime("Nguyen Vang Go", 3);
        sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);

        NhanVienFullTime ft = new NhanVienFullTime("Le Thi Chung", 5);
        ft.setLoaiChucVu(Configs.NHAN_VIEN_LINH);

        NhanVienPartTime partTime = new NhanVienPartTime("Tran Van Cuop", 140);

        sep.tinhLuong();
        ft.tinhLuong();
        partTime.tinhLuong();

        sep.xuatThongTin();
        ft.xuatThongTin();
        partTime.xuatThongTin();
    }
}
