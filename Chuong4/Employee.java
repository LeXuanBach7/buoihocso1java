package Chuong4;
import java.util.Scanner;
public class Employee {
    private String employeeID;
    private int age;
    private String department;

    public String getEmployeeID() {
        return employeeID;
    }
    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien: ");
        employeeID = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        age = scanner.nextInt();
        scanner.nextLine(); // Doc bo dong thua
        System.out.print("Nhap phong ban: ");
        department = scanner.nextLine();
    }
    public void displayData(){
        System.out.println("Ma nhan vien: " + employeeID);
        System.out.println("Tuoi: " + age);
        System.out.println("Phong ban: " + department);
    }
}