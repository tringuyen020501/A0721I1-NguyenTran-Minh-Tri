package bai2_vong_lap_trong_java.bai_tap;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        int count = 0;
        boolean check = true;
        int num = 2;
        System.out.println("20 số nguyên tố đầu tiên là:");
        for (int i = 2; i < 23; ) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    check = false;
                    break;
                }
            }
                if (check) {
                    System.out.println(num);
                    i++;
                    count++;
                }
                check = true;
                num++;
            }
        }
    }




