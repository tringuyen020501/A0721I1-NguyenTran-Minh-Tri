package bai14_thuat_toan_sap_xep.bai_tap;

import java.util.Scanner;

public class SelectionSort {
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
         selectionSort(list);
    }
    private static void selectionSort(int[] arr){
        int length= arr.length;

        for (int i = 0; i < length; i++) {
            int min_pos= i;

            for (int j = i; j < length; j++) {
                if(arr[min_pos] > arr[j]){
                    min_pos= j;
                }
            }
            if(min_pos!=i){
                int tmp= arr[min_pos];
                arr[min_pos]= arr[i];
                arr[i]= tmp;
            }
            System.out.print("List after the  " + i + " sort: ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
            System.out.println();
        }
    }
}



