package bai14_thuat_toan_sap_xep.bai_tap;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSort(list);
    }
    private static void insertionSort(int[] list){
        int length= list.length;
        for (int i = 1; i < length; i++) {
            int tmp= list[i];
            int pos= i-1;

            while (pos>=0 && list[pos]> tmp){
                list[pos+1]= list[pos];
                pos--;
            }
            list[pos+1]= tmp;
            System.out.print("List after the  " + i + "' sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}

