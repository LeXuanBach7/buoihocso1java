package BaiTapCuoiChuong4;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1SoNguyenArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so nguyen thu " + (i + 1) + ": ");
            int giatri = scanner.nextInt();
            list.add(giatri);
        }

        System.out.println("Day so nguyen vua nhap: " + list);

        // Nhap gia tri can xoa
        System.out.print("Nhap gia tri can xoa khoi mang: ");
        int x = scanner.nextInt();

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == x) {
                list.remove(i);
            }
        }

        System.out.println("Day so nguyen sau khi xoa cac phan tu co gia tri " + x + ": " + list);
    }
}
