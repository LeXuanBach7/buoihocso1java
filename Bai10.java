import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một chuỗi không quá 80 ký tự: ");
        String input = scanner.nextLine();

        System.out.print("Nhập một ký tự bất kỳ: ");
        char character = scanner.next().charAt(0);

        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == character) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự '" + character + "' trong chuỗi là: " + count);

        scanner.close();
    }
}
