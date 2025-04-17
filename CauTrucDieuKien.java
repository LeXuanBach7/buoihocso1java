import java.util.Scanner;

public class CauTrucDieuKien { // Đổi tên lớp thành CauTrucDieuKien
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên dương từ bàn phím
        System.out.print("Nhập một số nguyên dương: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Vui lòng nhập một số nguyên dương!");
        } else {
            // Gọi hàm tính tổng các chữ số
            int sum = tinhTongChuSo(number);
            System.out.println("Tổng các chữ số của " + number + " là: " + sum);
        }
    }

    // Hàm tính tổng các chữ số của một số nguyên dương
    public static int tinhTongChuSo(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10; // Lấy chữ số cuối cùng
            n /= 10;       // Bỏ chữ số cuối cùng
        }
        return sum;
    }
}