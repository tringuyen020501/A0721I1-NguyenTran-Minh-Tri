package bai13_thuat_toan_tim_kiem.bai_tap;

public class TimKiemNhiPhanSuDungDeQuy {
    public static int binarySearch(int array[], int left, int right, int value) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (array[mid] == value) return mid;
            if (array[mid] > value) return binarySearch(array,left ,mid-1, value);
             return binarySearch(array, mid+1, right, value);
        }
        return -1;
    }
    public static void main(String[] args) {
         int[] a = {6,13,15,20,38,44,53,89};
        System.out.println(binarySearch(a,0, a.length-1, 44));
    }
}
