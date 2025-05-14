package model;

import util.Configs;

public class NhanVienFullTime extends NhanVien {
    private int ngayLamThem;
    private int loaiChucVu;

    public NhanVienFullTime(String ten) {
        super(ten);
    }

    public NhanVienFullTime(String ten, int ngayLamThem) {
        super(ten);
        this.ngayLamThem = ngayLamThem;
    }

    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }

    @Override
    public String loaiNhanVien() {
        return "Nhan vien FullTime";
    }

    @Override
    public void tinhLuong() {
        if (loaiChucVu == Configs.NHAN_VIEN_SEP) {
            this.luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
        } else {
            this.luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
        }
    }
}

