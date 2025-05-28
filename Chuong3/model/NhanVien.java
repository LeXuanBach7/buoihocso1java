package Chuong3.model;

public abstract class NhanVien {
    protected String ten;
    protected long luong;

    public NhanVien() {}

    public NhanVien(String ten) {
        this.ten = ten;
    }

    public abstract String loaiNhanVien();
    public abstract void tinhLuong();

    public void xuatThongTin() {
        System.out.println("Ten: " + ten);
        System.out.println("Loai nhan vien: " + loaiNhanVien());
        System.out.println("Luong: " + luong + " VND");
        System.out.println("-------------------------");
    }
}
