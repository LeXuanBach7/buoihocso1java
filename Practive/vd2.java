package Practive;
import java.util.Scanner;

public class vd2{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so ngay cua ban");
        int n = scanner.nextInt();
        switch (n) {
            case 0:
                System.out.println("Chao mung ban den voi ngay chu nhat");
                break;
            case 1:System.out.println("day la ngay thu hai");
                break;
            case 2:System.out.println("day la ngay thu ba");    
                break;      
            case 3:System.out.println("Day la ngay thu tu");
                break;
            case 4:System.out.println("Day la ngay thu nam");
                break;
            case 5:System.out.println("Day la ngay thu sau");
                break;
            case 6:System.out.println("Day la ngay thu bay");
                break;
            default:System.out.println("ban da nhap sai vui long nhap lai di");
                break;
        }

    }
}