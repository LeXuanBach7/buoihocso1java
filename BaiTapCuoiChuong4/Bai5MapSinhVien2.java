package BaiTapCuoiChuong4;
import java.util.*;

public class Bai5MapSinhVien2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, SinhVien2> danhSachSV = new HashMap<>();

        // Nhập danh sách sinh viên
        System.out.print("Nhập số lượng sinh viên: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print("Mã sinh viên: ");
            String maSV = scanner.nextLine();
            System.out.print("Họ và tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Lớp: ");
            String lop = scanner.nextLine();

            SinhVien2 sv = new SinhVien2(maSV, hoTen, lop);
            danhSachSV.put(maSV, sv);
        }

        // Tìm theo tên lớp
        System.out.print("\nNhập tên lớp cần tìm: ");
        String tenLop = scanner.nextLine();
        System.out.println("Danh sách sinh viên thuộc lớp " + tenLop + ":");
        for (SinhVien2 sv : danhSachSV.values()) {
            if (sv.getLop().equalsIgnoreCase(tenLop)) {
                System.out.println(sv);
            }
        }

        // Tìm theo mã sinh viên
        System.out.print("\nNhập mã sinh viên cần tìm: ");
        String maTim = scanner.nextLine();
        if (danhSachSV.containsKey(maTim)) {
            SinhVien2 sv = danhSachSV.get(maTim);
            System.out.println("Họ tên: " + sv.getHoTen() + ", Lớp: " + sv.getLop());
        } else {
            System.out.println("Không tìm thấy sinh viên có mã " + maTim);
        }

        scanner.close();
    }
}

