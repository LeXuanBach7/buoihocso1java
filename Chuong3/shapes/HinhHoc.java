package Chuong3.shapes;

public class HinhHoc {
    public static final float PI = 3.14f;
    public String ten;
    public float chuVi;
    public float dienTich;
    public float theTich;

    public HinhHoc(String ten) {
        this.ten = ten;
    }

    public void xuatTen() {
        System.out.println("\n==== " + ten + " ====");
    }

    public void inChuVi() {
        System.out.println("Chu vi = " + chuVi);
    }

    public void inDienTich() {
        System.out.println("Diện tích = " + dienTich);
    }

    public void inTheTich() {
        System.out.println("Thể tích = " + theTich);
    }
}
