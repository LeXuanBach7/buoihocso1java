package Baitapchuong2;
import java.util.Scanner;
public class sosanhhaiso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập số thứ nhất: ");
    int a = scanner.nextInt();
    System.out.print("Nhập số thứ hai: ");
    int b = scanner.nextInt();
    if (a > b) {
        System.out.println("số nhỏ nhất là:"+b);
    } else if (a < b) {
        System.out.println("Số nhỏ nhất là:"+a);
    } else {
        System.out.println("Hai số bằng nhau.");
    }
    }
}