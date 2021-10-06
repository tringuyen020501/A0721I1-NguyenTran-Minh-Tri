package bai3_mang_va_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriMaxTrongMang {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner =new Scanner(System.in);
        do{
            System.out.println("nhập size");
            size=scanner.nextInt();
            if (size>20)
                System.out.println("Size phải nhỏ hơn 20");
        }while (size>20);
            arr= new int[size];
            int i=0;
            while (i<arr.length){
                System.out.println("nhập giá trị" +(i+1)+":");
                arr[i]= scanner.nextInt();
                i++;
            }
        System.out.println("Danh sách đã nhập là:");
            for (int j=0; j<arr.length;j++){
                System.out.println(arr[j]+"\n");
            }
            int max = arr[0];
            int index=1;
            for (int j=0;j<arr.length;j++){
                if (arr[j]>max){
                    max = arr[j];
                    index=j+1;
                }
            }
        System.out.println("Giá Trị lớn nhất trong danh sách là:"+max+",ở vị trí:"+index);
    }
}
