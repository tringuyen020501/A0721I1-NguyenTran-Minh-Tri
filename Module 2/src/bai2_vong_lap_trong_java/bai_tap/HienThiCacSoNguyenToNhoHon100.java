package bai2_vong_lap_trong_java.bai_tap;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int count =0;
        boolean check = true;
        int num=2;
        System.out.println("các số nguyên tố nhỏ hơn 100 là ");
        while (num<100){
            check=true;
            for (int i=2; i<=15;i++){
                for (int j =2; j<=Math.sqrt(num);j++){
                    if (num%j ==0){
                        check=false;
                        break;
                    }
                }
                if (check){
                    System.out.println(num);
                    count++;
                }
                check=true;
                num++;
            }
        }

    }
}
