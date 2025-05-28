package Practive;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

    public class ThucHanhCoban{
        /**
         * @param args
         */
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int sum=0;
            System.out.println("Nhập vào số nguyên:");
            int n = scanner.nextInt();

            while(n>0){
                int sodu = n % 10;
                n= n/10;
                sum +=sodu;

            }
            System.out.println("tổng các chữ số nhập vào là:"+sum);

        }
    }
