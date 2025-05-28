package Practive;
import java.util.Scanner;
public class vidutieptheo {
    public static void main(String[] args){
        int st1,st2;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat");
        st1 = scanner.nextInt();
        System.out.println("Nhap vao so thu hai");
        st2 = scanner.nextInt();
        if(st1<st2){
            int min= st1;
            System.out.print("So nho nhat la:"+min);
        }else if(st1==st2){
            System.out.print("Hai so bang nhau");
        }else{
            int min= st2;
            System.out.print("So nho nhat la:"+min);
        }

    }
    
}
