package shapes;
import java.util.Scanner;
import shapes.HinhTron;
import shapes.HinhTru;
import shapes.HinhChuNhat;
import shapes.HinhVuong;

public class Main {
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.xuatTen();
        ht.inChuVi();
        ht.inDienTich();

        HinhTru htr = new HinhTru();
        htr.nhapBanKinh();
        htr.tinhDienTich();
        htr.nhapChieuCao();
        htr.tinhTheTich();
        htr.xuatTen();
        htr.inTheTich();

        HinhChuNhat hcn = new HinhChuNhat();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.xuatTen();
        hcn.inChuVi();
        hcn.inDienTich();

        HinhVuong hv = new HinhVuong();
        hv.nhapCanh();
        hv.tinhChuVi();
        hv.tinhDienTich();
        hv.xuatTen();
        hv.inChuVi();
        hv.inDienTich();
    }
}
