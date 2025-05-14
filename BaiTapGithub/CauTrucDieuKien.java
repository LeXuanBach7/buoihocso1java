package BaiTapGithub;
import java.util.Scanner;

public class CauTrucDieuKien { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Nhập một số nguyên dương: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Vui lòng nhập một số nguyên dương!");
        } else {

            int sum = tinhTongChuSo(number);
            System.out.println("Tổng các chữ số của " + number + " là: " + sum);
        }
    }


    public static int tinhTongChuSo(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10; 
            n /= 10;
        }
        return sum;
    }
}
