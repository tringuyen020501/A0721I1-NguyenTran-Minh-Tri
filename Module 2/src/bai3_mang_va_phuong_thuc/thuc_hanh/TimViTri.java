package bai3_mang_va_phuong_thuc.thuc_hanh;

import java.util.Scanner;

public class TimViTri {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhập tên SV cần tiềm");
        String input_name= scanner.nextLine();
        boolean isExit= false;
        for (int i=0; i<students.length;i++){
            if (students[i].equals(input_name)){
                System.out.println("Vị trí của sinh viên "+input_name+"is:" +(i+1));
                isExit=true;
                break;
            }
        }
        if (!isExit){
            System.out.println("k có "+input_name+"trong danh sách");
        }
    }
}
