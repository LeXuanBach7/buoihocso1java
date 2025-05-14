package BaiTapGithub;
import java.util.Scanner;

public class Bai3tenvatuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String ten = scanner.nextLine();
        System.out.print("Nhập năm sinh của bạn: ");
        int nam = scanner.nextInt();
        int namHienTai = 2025;
        int tuoi = namHienTai - nam;
        if (tuoi <16) {
            System.out.println("Bạn"+ten+"ở độ tuổi vị thành niên");
        } else if (tuoi >= 16 && tuoi < 18) {
            System.out.println("Bạn"+ten+"ở độ tuổi trưởng thành");
        } else if (tuoi >= 18) {
            System.out.println("Bạn"+ten+"đã già");
            
        }  
    }   
}
