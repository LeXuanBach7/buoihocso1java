package C4CacKieuDuLieu;

import java.util.HashSet;
import java.util.Scanner;

public class PhuongThucHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập phần tử cần thêm vào HashSet: ");
        String value = scanner.nextLine();

        boolean added = set.add(value); 

        if (added) {
            System.out.println("Đã thêm phần tử: " + value);
        } else {
            System.out.println("Phần tử đã tồn tại trong HashSet.");
        }

        System.out.println("HashSet hiện tại: " + set);

        
        System.out.print("Nhập phần tử cần xóa khỏi HashSet: ");
        String removeValue = scanner.nextLine();

        boolean removed = set.remove(removeValue);

        if (removed) {
            System.out.println("Đã xóa phần tử: " + removeValue);
        } else {
            System.out.println("Không tìm thấy phần tử trong HashSet.");
        }

        System.out.println("HashSet sau khi xóa: " + set);
    }
}
