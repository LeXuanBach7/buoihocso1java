package Baitapchuong2;
import java.util.Scanner;

public class Bai5tongcacsonhohon100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n;

        System.out.println("Nhập các số nguyên dương. Chương trình sẽ kết thúc khi tổng lớn hơn 100.");
        do {
            System.out.print("Nhập số: ");
            n = scanner.nextInt();
            sum += n;
            System.out.println("Tổng hiện tại: " + sum);
        } while (sum <= 100);
        System.out.println("Tổng đã vượt quá 100.= " + sum);;
        scanner.close();
    }
}
