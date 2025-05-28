package Chuong4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DemoLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Thêm một số phần tử mẫu
        map.put("A", "Apple");
        map.put("B", "Banana");
        map.put("C", "Cherry");

        System.out.println("LinkedHashMap ban dau: " + map);

        // Xóa một phần tử bất kỳ do người dùng nhập key
        System.out.print("Nhap key can xoa: ");
        String key = scanner.nextLine();

        String removedValue = map.remove(key);

        if (removedValue != null) {
            System.out.println("Da xoa phan tu co key: " + key);
        } else {
            System.out.println("Khong tim thay key trong LinkedHashMap.");
        }

        System.out.println("LinkedHashMap sau khi xoa: " + map);
    }
}
