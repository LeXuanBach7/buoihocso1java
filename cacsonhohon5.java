import java.util.Scanner;

public class cacsonhohon5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên dương: ");
        int number = scanner.nextInt();

        System.out.println("Các số nhỏ hơn 5 là:");
        for (int i = 0; i < 5 && i < number; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
