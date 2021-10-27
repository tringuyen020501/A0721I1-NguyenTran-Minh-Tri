package bai9_dsa_danh_sach.thuc_hanh;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list= new MyList<>();
        list.add(2);
        list.add(6);
        list.add(8);
        list.add(200);
        System.out.println("danh  sách các integer đã nhập là:");
        for (int i =0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
