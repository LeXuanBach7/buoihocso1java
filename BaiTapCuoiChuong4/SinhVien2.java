package BaiTapCuoiChuong4;
public class SinhVien2 {
    private String maSV;
    private String hoTen;
    private String lop;

    public SinhVien2(String maSV, String hoTen, String lop) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }

    public String toString() {
        return "Mã SV: " + maSV + ", Họ tên: " + hoTen + ", Lớp: " + lop;
    }
}

