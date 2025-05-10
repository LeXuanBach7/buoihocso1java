import java.util.Scanner;

public class ThongTinCaNhan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin từ người dùng
        System.out.print("Nhập tên của bạn: ");
        String ten = scanner.nextLine();

        System.out.print("Nhập tuổi của bạn: ");
        int tuoi = scanner.nextInt();

        System.out.print("Nhập chiều cao của bạn (cm): ");
        double chieucao = scanner.nextDouble();

        // Hiển thị thông tin
        System.out.println("\n--- Thông tin cá nhân ---");
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Chiều cao: " + chieucao + " cm");
    }
}