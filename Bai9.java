import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một chuỗi bất kỳ: ");
        String input = scanner.nextLine();

        int lowerCaseCount = 0, upperCaseCount = 0, digitCount = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowerCaseCount++;
            } else if (Character.isUpperCase(c)) {
                upperCaseCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        System.out.println("Số ký tự thường: " + lowerCaseCount);
        System.out.println("Số ký tự hoa: " + upperCaseCount);
        System.out.println("Số ký tự số: " + digitCount);

        scanner.close();
    }
}
