package bai10_dsa_danh_sach.thuc_hanh;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("Test");
        MyLinkedList<Integer> MyLinkedList= new MyLinkedList<>(5);
        MyLinkedList.add(4, 5);
        MyLinkedList.add(4, 4);
        MyLinkedList.add(4, 3);
        System.out.println("danh sach da nhap la:");
        MyLinkedList.printList();
    }
}
