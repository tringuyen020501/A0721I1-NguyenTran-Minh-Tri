package bai3_mang_va_phuong_thuc.bai_tap;

import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8};
        int lenghth= arr1.length+arr2.length;
        int[] arr3=new int[lenghth];
        int pos=0;
        for (int element:arr1){
            arr3[pos]=element;
            pos++;
        }
        for (int element:arr2){
            arr3[pos]=element;
            pos++;
        }
        System.out.println(Arrays.toString(arr3));
     }
}
