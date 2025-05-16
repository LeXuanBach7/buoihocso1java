package C4CacKieuDuLieu;
import java.lang.foreign.Linker;
import java.util.LinkedList;
public class PhuongThucLinkedList {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();


        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println("Danh sách: " + list);


        list.remove("B");

        System.out.println("Danh sách sau khi xóa B: " + list);

   
        System.out.println("Danh sách có rỗng không? " + list.isEmpty());

        System.out.println("Kích thước của danh sách: " + list.size());
        
        System.out.println("Phần tử đầu tiên trong danh sách: " + list.getFirst());
        System.out.println("Phần tử cuối cùng trong danh sách: " + list.getLast());
        
        list.addFirst("X");
        
        LinkedList<String> list1 = new LinkedList<>();

        list1.addAll(list);

        System.out.println(list1);
    } 
}
