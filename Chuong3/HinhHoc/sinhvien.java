package Chuong3.HinhHoc;
import java.util.Scanner;

public class sinhvien {
    // Khai báo thuộc tính
    public String ten;
    public int tuoi;
    public String MaSV;
    public float DiemTB;
    public void nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên: ");
        ten = sc.nextLine();
        System.out.print("Nhập tuổi sinh viên: ");
        tuoi = sc.nextInt();
        System.out.print("Nhập mã sinh viên: ");
        MaSV = sc.next();
        System.out.print("Nhập điểm trung bình: ");
        DiemTB = sc.nextFloat();
    }   
    public String getLowerCaseten(){
     return ten.toLowerCase();
    }
    public int getTuoi() {
        return tuoi;
    
    }
    public String getMaSV() {
        return MaSV;
    }
    public float getDiemTB() {
        return DiemTB;
    }
    public String xemthongtin(){
        return "Tên sinh viên: " + ten + "\n" +
               "Tuổi sinh viên: " + tuoi + "\n" +
               "Mã sinh viên: " + MaSV + "\n" +
               "Điểm trung bình: " + DiemTB;
    }
}
