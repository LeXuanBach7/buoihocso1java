package Chuong4;

import java.util.LinkedList;
import java.util.Scanner;

public class Baitaplinkedlist {
    public static void main(String[] args) {
        LinkedList<Student> linkedListStudents = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên cần thêm: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng thừa

        // Vòng lặp thêm n phần tử vào danh sách
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            Student student = new Student();
            student.inputData();
            linkedListStudents.add(student);
        }

        // Hiển thị danh sách sinh viên
        System.out.println("\nDanh sách sinh viên:");
        for (Student student : linkedListStudents) {
            student.displayData();
        }

        // Sử dụng Iterator để duyệt danh sách
        System.out.println("\nDuyệt danh sách bằng Iterator:");
        var iterator = linkedListStudents.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            student.displayData();
        }

        // Sử dụng vòng lặp for để duyệt danh sách
        System.out.println("\nDuyệt danh sách bằng vòng lặp for:");
        for (int i = 0; i < linkedListStudents.size(); i++) {
            Student student = linkedListStudents.get(i);
            student.displayData();
        }
    }
}
