package Baitapchuong2;
import java.util.Scanner;

public class Bai8trungbinhcong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử n: ");
        int n = scanner.nextInt();
        int sum = 0;
            for (int i = 0; i < n; i++) {
                System.out.print("Nhập số thứ " + (i + 1) + ": ");
                int number = scanner.nextInt();
                sum += number;
            }

            double trungbinh = (double) sum / n;
            System.out.println("Trung bình cộng của " + n + " số nguyên đã nhập là: " + trungbinh);
        }
    }
