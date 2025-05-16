package C4CacKieuDuLieu;

import java.util.Scanner;
import java.util.TreeSet;

public class PhuongThucTreeSet {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        set.add("A");
        set.add("B");
        set.add("C");

        System.out.println("TreeSet ban đầu: " + set);

        System.out.print("Nhập phần tử cần thêm vào TreeSet: ");
        String value = scanner.nextLine();

        boolean added = set.add(value);

        if (added) {
            System.out.println("Đã thêm phần tử: " + value);
        } else {
            System.out.println("Phần tử đã tồn tại trong TreeSet.");
        }

        System.out.println("TreeSet sau khi thêm: " + set);
    }
}
