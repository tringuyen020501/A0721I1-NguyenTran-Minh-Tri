package bai13_thuat_toan_tim_kiem.thuc_hanh;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter String");
        String inputString= scanner.nextLine();

        int[] frequenChar= new int[25];
        for(int i=0; i<inputString.length();i++){
            // Tìm vị trí tương ứng kí tự trong bảng ASCII
            int ascii = (int) inputString.charAt(i);
            frequenChar[ascii]+=1;
        }

        int max=0;
        char character = (char) 255;
        for (int j =0;j<255;j++){
            if (frequenChar[j]>max){
                max =frequenChar[j];
                character = (char) j;
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }

}
