package Chuong4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BaitapArrayList {
    public static void main(String[] args) {
        ArrayList<Student> arrayListStudents = new ArrayList<>();
        //LinkedList<Student> linkedListStudents = new LinkedList<>();co the thay the bang linkedlist

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên cần thêm: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng thừa

        // Vòng lặp thêm n phần tử vào mảng
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            Student student = new Student();
            student.inputData(); // Gọi phương thức nhập dữ liệu của lớp Student
            arrayListStudents.add(student); // Thêm sinh viên vào danh sách
        }

        // Hiển thị danh sách sinh viên
        System.out.println("\nDanh sách sinh viên:");
        for (Student student : arrayListStudents) {
            student.displayData(); // Gọi phương thức hiển thị dữ liệu của lớp Student
        }
        Iterator<Student> iterator = arrayListStudents.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println("Tên sinh viên: " + student.ten);
            System.out.println("Mã sinh viên: " + student.maSV);
            student.displayData(); // Gọi phương thức hiển thị dữ liệu của lớp Student
        }
        for(int i = 0; i < arrayListStudents.size(); i++) {
            Student student = arrayListStudents.get(i);
            System.out.println("Tên sinh viên: " + student.ten);
            System.out.println("Mã sinh viên: " + student.maSV);
            student.displayData(); // Gọi phương thức hiển thị dữ liệu của lớp Student
        }
    }
}