package BaiTapGithub;
import java.util.Scanner;

public class tuanletrongngay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số ngày từ người dùng
        System.out.println("Nhập một số từ 1 đến 7 để hiển thị ngày trong tuần: ");
        int number = scanner.nextInt();

        // Sử dụng switch-case để hiển thị ngày tương ứng
        switch (number) {
            case 1:
                System.out.println("Thứ Hai");
                break;
            case 2:
                System.out.println("Thứ Ba");
                break;
            case 3:
                System.out.println("Thứ Tư");
                break;
            case 4:
                System.out.println("Thứ Năm");
                break;
            case 5:
                System.out.println("Thứ Sáu");
                break;
            case 6:
                System.out.println("Thứ Bảy");
                break;
            case 7:
                System.out.println("Chủ Nhật");
                break;
            default:
                System.out.println("Số không hợp lệ! Vui lòng nhập số từ 1 đến 7.");
        }

        // Đóng Scanner
        scanner.close();
    }
}
