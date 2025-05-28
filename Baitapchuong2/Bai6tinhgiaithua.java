package Baitapchuong2;
import java.util.Scanner;

public class Bai6tinhgiaithua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.print("Nhập một số nguyên dương: ");
            number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Số không hợp lệ! Vui lòng nhập lại.");
            }
        } while (number < 0);

        long giaithua = 1;
        int i = 1;
        do {
            giaithua *= i;
            i++;
        } while (i <= number);

        System.out.println("Giai thừa của " + number + " là: " + giaithua);

        scanner.close();
    }
}
