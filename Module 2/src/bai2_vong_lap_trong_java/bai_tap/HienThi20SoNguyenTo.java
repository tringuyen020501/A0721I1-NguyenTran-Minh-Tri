package bai2_vong_lap_trong_java.bai_tap;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        String result = "";
        while (count < 20) {
            boolean check = true;
            if (number < 2) {
                check = false;
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        check = false;
                        break;
                    }
                }
            }
            if (check) {
                result += number+",";
                count++;
            }
            number++;
        }
        System.out.println(result);
    }
}



