package Chuong4;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class PhuongThucLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);

        // Thêm một số phần tử vào LinkedHashSet
        set.add("A");
        set.add("B");
        set.add("C");

        System.out.println("LinkedHashSet ban đầu: " + set);

        // Xóa một phần tử bất kỳ do người dùng nhập
        System.out.print("Nhập phần tử cần xóa khỏi LinkedHashSet: ");
        String value = scanner.nextLine();

        boolean removed = set.remove(value);

        if (removed) {
            System.out.println("Đã xóa phần tử: " + value);
        } else {
            System.out.println("Không tìm thấy phần tử trong LinkedHashSet.");
        }

        System.out.println("LinkedHashSet sau khi xóa: " + set);
    }
}