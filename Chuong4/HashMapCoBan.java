package Chuong4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapCoBan {
    public static void main(String[] args) {
        HashMap<String, String> hashMap1 = new HashMap<>();
        hashMap1.put("xe may", "Honda");
        hashMap1.put("may bay", "Boeing");
        hashMap1.put("tau", "VNtrain");
        hashMap1.put("oto", "Toyota");
        hashMap1.put("xe dap", "Giant");

        Set<String> keys = hashMap1.keySet();
        Set<Map.Entry<String, String>> entries = hashMap1.entrySet();
        System.out.println("Cac phan tu trong HashMap: " + entries);
        System.out.println("Kich thuoc cua HashMap: " + hashMap1.size());
        System.out.println("Cac khoa trong HashMap: " + keys);
        System.out.println("Gia tri cua khoa 'xe may': " + hashMap1.get("xe may"));
        System.out.println("Gia tri cua khoa 'oto': " + hashMap1.get("oto"));
 

        for (Map.Entry<String, String> entry : hashMap1.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    HashMap<String, Employee> mapEmployees = new HashMap<>();

    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap so luong nhan vien: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
           
            Employee emp = new Employee();
            emp.inputData(); // Nhập thông tin nhân viên
            mapEmployees.put(emp.getEmployeeID(), emp);
        }
        for (String key : mapEmployees.keySet()) {
            Employee emp = mapEmployees.get(key);
            System.out.println(key);
            emp.displayData(); // Hiển thị thông tin nhân viên
        }

    }
}