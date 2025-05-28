package Chuong4;

import java.util.ArrayList;

public class PhuongThucArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add(0, "c");
        list.set(2, "D");
        list.remove(0);
        list.remove("B");
        list.clear();
        list.add("A");
        list.add("B");
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.indexOf("A"));
        System.out.println(list.contains("A"));
    }
}
