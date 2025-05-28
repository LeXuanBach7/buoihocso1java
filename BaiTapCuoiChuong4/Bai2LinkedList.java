package BaiTapCuoiChuong4;
import java.util.Scanner;
import java.util.LinkedList;
public class Bai2LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            list.add(value);
        }

        System.out.println("Cac so chan trong danh sach:");
        int sum = 0;
        int count = 0;
        for (int value : list) {
            if (value % 2 == 0) {
                System.out.print(value + " ");
                sum += value;
                count++;
            }
        }
        System.out.println();
        if (count > 0) {
            double avg = (double) sum / count;
            System.out.println("Trung binh cong cac so chan: " + avg);
        } else {
            System.out.println("Khong co so chan trong danh sach.");
        }
    }
}