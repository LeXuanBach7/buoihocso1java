package Chuong4;

import java.util.ArrayList;
import java.util.Scanner;

public class PhanTuLonNhat {
    public static void main(String[] args) {
        
        NumberList numberList = new NumberList();

        
        numberList.inputNumbers();

       
        numberList.displayNumbers();

     
        int max = numberList.findMax();
        System.out.println("Số lớn nhất trong danh sách: " + max);
    }
}

