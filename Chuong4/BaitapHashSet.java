package Chuong4;

import java.util.HashSet;
import java.util.Scanner;

public class BaitapHashSet {
    public static void main(String[] args) {
        HashSet<Student> studentSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên cần thêm: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            Student student = new Student();
            student.inputData();
            if (!studentSet.add(student)) {
                System.out.println("Sinh viên này đã tồn tại (trùng mã sinh viên)!");
            }
        }

        
        System.out.println("\nDanh sách sinh viên (không trùng lặp):");
        for (Student student : studentSet) {
            student.displayData();
        }
    }
}
