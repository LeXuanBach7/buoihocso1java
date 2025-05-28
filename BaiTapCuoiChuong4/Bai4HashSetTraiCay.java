package BaiTapCuoiChuong4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.*;

public class Bai4HashSetTraiCay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> danhsachtraicay = new HashSet<>();

        System.out.println("Nhap ten cac loai trai cay (nhan Enter khong nhap gi de ket thuc):");
        while (true) {
            String traiCay = sc.nextLine().trim();
            if (traiCay.isEmpty()) break;
            danhsachtraicay.add(traiCay);
        }

        System.out.println("So phan tu trong HashSet: " + danhsachtraicay.size());

        System.out.print("Nhap ten trai cay can kiem tra: ");
        String kiemtratraicay = sc.nextLine().trim();
        if (danhsachtraicay.contains(kiemtratraicay)) {
            System.out.println("Da tim thay " + kiemtratraicay + " trong HashSet.");
        } else {
            System.out.println("Khong tim thay " + kiemtratraicay + " trong HashSet.");
        }

        System.out.print("Nhap ten trai cay can xoa: ");
        String xoaTraiCay = sc.nextLine().trim();
        danhsachtraicay.remove(xoaTraiCay);
        System.out.println("Cac phan tu con lai trong HashSet:");
        for (String traiCay : danhsachtraicay) {
            System.out.println(traiCay);
        }

        List<String> dsthemtraicay = new ArrayList<>();
        System.out.println("Nhap ten cac loai trai cay them tu List (nhan Enter khong nhap gi de ket thuc):");
        while (true) {
            String traiCay = sc.nextLine().trim();
            if (traiCay.isEmpty()) break;
            dsthemtraicay.add(traiCay);
        }

        danhsachtraicay.addAll(dsthemtraicay);

        System.out.println("HashSet sau khi them tu List:");
        Iterator<String> it = danhsachtraicay.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        danhsachtraicay.removeAll(dsthemtraicay);
        System.out.println("HashSet sau khi xoa cac phan tu cua List:");
        for (String traiCay : danhsachtraicay) {
            System.out.println(traiCay);
        }
    }
}
