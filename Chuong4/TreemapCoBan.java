package Chuong4;

import java.util.Map;
import java.util.TreeMap;

public class TreemapCoBan {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Ba");
        treeMap.put(1, "Mot");
        treeMap.put(2, "Hai");
        treeMap.put(5, "Nam");
        treeMap.put(4, "Bon");

        // Thay the value cua key = 2 bang "Hai moi" su dung replace
        treeMap.replace(2, "Hai moi");

        System.out.println("Cac entry trong TreeMap:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
