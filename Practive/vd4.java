package Practive;
import java.util.Scanner;
public class vd4 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int tong =0;
        do{
            System.out.println("Nhap so nguyen:");
            int n = scanner.nextInt();
            tong += n;
        }while(tong<100);
           // In ra tong cac so da nhap
        System.out.println("Tong cac so da nhap la:"+tong);
        for(int i=0;i<5;i++){
                System.out.println("cac so nho hon 5 la:"+i);
        }
        for (int i=0;i<20;i++){
            if(i%5!=0){
                continue;

            }
            System.out.println("cac so chia het cho 5 la:"+i);
        }
}
}
