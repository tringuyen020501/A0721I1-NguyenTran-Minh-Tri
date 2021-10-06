package bai3_mang_va_phuong_thuc.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhập size mảng:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("phần tử mảng phải nhỏ hơn 20 nhé:");
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Giá Trị tại vị trí " + (i + 1));
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Mảng đã nhập :");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        System.out.println("nhập phần tử thêm vào:");
        int x= scanner.nextInt();
        insert(arr,x);
    }
    public static void insert(int[] arr,int x){
        if (arr[0]>x){
            for (int i=arr.length-1;i>0;i--){
                arr[i]=arr[i-1];
                arr[0]=x;
            }
        }else if (arr[arr.length-1]<x ) arr[arr.length-1]=x;
        else {
            int index=0;
            for (int i =0;i<arr.length;i++){
                if (arr[i]>x){
                    index=i;
                    break;
                }
                for (int j=arr.length-1;j>index;j--){
                        arr[j]=arr[j-1];
                        arr[index]=x;
                }
                show(arr);
            }
        }
    }
    public static void show(int[] arr){
        System.out.println("mảng a là:");
        for (int x:arr)
            System.out.print(x+"");
        System.out.println("");
    }
}

