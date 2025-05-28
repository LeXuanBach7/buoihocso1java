package Chuong5;

public class CaccaulenhNgoaiLe {
    public static void main(String[] args) {
        try {
           //cac  cau lenh phat sinh ngoai le
            int a = 5 / 0; // Chia cho 0
            int[] arr = new int[5];
            arr[10] = 100; // Truy cập chỉ số ngoài phạm vi
            String str = null;
            System.out.println(str.length()); // Gọi phương thức trên đối tượng null
        } catch (ArithmeticException e) {
            System.out.println("Lỗi chia cho 0: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Lỗi chỉ số mảng ngoài phạm vi: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Lỗi null pointer: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi khác: " + e.getMessage());
        } finally {
            System.out.println("Khối finally luôn được thực thi.");
        }
    }
}