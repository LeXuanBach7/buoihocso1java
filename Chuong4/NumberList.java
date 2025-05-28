package Chuong4;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberList {
    private ArrayList<Integer> numbers; 
    private Scanner scanner;

    // Constructor
    public NumberList() {
        numbers = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

   
    public void inputNumbers() {
        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();

        System.out.println("Nhập các số nguyên:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            int number = scanner.nextInt();
            numbers.add(number); 
        }
    }

    // Phương thức tìm số lớn nhất
    public int findMax() {
        if (numbers.isEmpty()) {
            throw new IllegalStateException("Danh sách rỗng, không thể tìm số lớn nhất.");
        }

        int max = numbers.get(0); // Giả sử phần tử đầu tiên là lớn nhất
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i); // Cập nhật số lớn nhất
            }
        }
        return max;
    }

    // Phương thức hiển thị danh sách
    public void displayNumbers() {
        if (numbers.isEmpty()) {
            System.out.println("Danh sách hiện đang trống.");
        } else {
            System.out.println("Danh sách các số: " + numbers);
        }
    }
}
