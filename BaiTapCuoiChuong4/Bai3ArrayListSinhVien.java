package BaiTapCuoiChuong4;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai3ArrayListSinhVien {
    public static void main(String[] args) {
        ArrayList<SinhVien> danhSach = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Nhập danh sách sinh viên
        while (true) {
            System.out.print("Nhập tên sinh viên (để trống để dừng): ");
            String ten = sc.nextLine().trim();
            if (ten.isEmpty()) break;

            System.out.print("Nhập điểm: ");
            double diem = Double.parseDouble(sc.nextLine());

            danhSach.add(new SinhVien(ten, diem));
        }

        System.out.println("\nDanh sách sinh viên phải thi lại (điểm <= 5):");
        int demThiLai = 0;
        for (SinhVien sv : danhSach) {
            if (sv.getDiem() <= 5) {
                sv.hienThi();
                demThiLai++;
            }
        }
        System.out.println("Tổng số sinh viên phải thi lại: " + demThiLai);

        double diemCaoNhat = -1;
        for (SinhVien sv : danhSach) {
            if (sv.getDiem() > diemCaoNhat) {
                diemCaoNhat = sv.getDiem();
            }
        }

        System.out.println("\nSinh viên có điểm cao nhất (" + diemCaoNhat + "):");
        for (SinhVien sv : danhSach) {
            if (sv.getDiem() == diemCaoNhat) {
                sv.hienThi();
            }
        }

        System.out.print("\nNhập tên sinh viên cần tìm: ");
        String tenTim = sc.nextLine().trim().toLowerCase();

        boolean timThay = false;
        System.out.println("Kết quả tìm kiếm:");
        for (SinhVien sv : danhSach) {
            if (sv.getTen().toLowerCase().contains(tenTim)) {
                sv.hienThi();
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Không tìm thấy sinh viên nào.");
        }
    }
}
