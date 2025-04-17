import java.util.Scanner;

public class tongcacsonhohon100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0; // Biến lưu tổng
        int n; // Biến lưu số nhập vào

        System.out.println("Nhập các số nguyên dương. Chương trình sẽ kết thúc khi tổng lớn hơn 100.");

        // Sử dụng do-while để đảm bảo ít nhất một lần nhập
        do {
            System.out.print("Nhập số: ");
            n = scanner.nextInt();
            sum += n; // Cộng số vừa nhập vào tổng
            System.out.println("Tổng hiện tại: " + sum);
        } while (sum <= 100); // Điều kiện: tiếp tục nếu tổng <= 100

        System.out.println("Tổng đã vượt quá 100.= " + sum);;
        scanner.close();
    }
}
