package Practive;
import java.util.Scanner;
public class vd5 {
    public static void main(String[]args){
        int a[];
        int []b;
        String []c = new String[5];
        double d[] = new double[5];
        double e[] = new double[]{1.2, 3.4, 5.6, 7.8, 9.0};
        double d2[]= {1.2, 3.4, 5.6, 7.8, 5.0};
        System.out.println("vi tri phan tu thu 5 trong mang la :"+d2[4]);
        System.out.println("co do dai la: "+d2.length);
        for(int i=0;i<e.length;i++){
            System.out.println("cac phan tu trong mang la :"+e[i]);
        }
        for(double f:d2){
            System.out.println("Cac phan tu trong mang d2 la:"+f);
        }
        Scanner scanner = new Scanner(System.in);

        // Nhap so phan tu cho mang sochan
        System.out.print("Nhap so luong phan tu cua mang sochan: ");
        int n = scanner.nextInt();
        int[] sochan = new int[n];
        for(int i=0;i<sochan.length;i++){
            System.out.print("Nhap phan tu thu"+(i+1)+": ");
            sochan[i]=scanner.nextInt();
    
        }
        int sum=0;
        for(int i=0;i<sochan.length;i++){
            if(sochan[i]%2==0){
                sum+=sochan[i];
            }
        }
        System.out.println("tong so chan trong mang la:"+sum);
        int arraynew[][]={{1,2},{3,4},{5,6}};
        System.out.println("cac phan mang:"+arraynew[2][1]);
    }
}

