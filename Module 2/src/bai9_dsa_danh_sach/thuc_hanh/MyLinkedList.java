package bai9_dsa_danh_sach.thuc_hanh;

public class MyLinkedList<T> {
    private Node head;
    private int numNodes =0;

     public MyLinkedList(){
     }
     public MyLinkedList (T element ){
         head = new Node(element);
     }

     private class Node{
         private Node next;
         private Object data;

         public Node(Object data){this.data= data;}
         public Object getData(){return this.data;}
     }

     public void add(int index, T element){
         Node temp = head;

         for (int i=0; i<index-1 && temp.next!= null; i++){
             temp = temp.next;
         }
         Node after = temp.next;
         temp.next= new Node(element);
         temp.next.next= temp;
         numNodes++;
     }

     public T get(int index){
         Node temp = head;
         for (int i =0; i<index;i++){
             temp= temp.next;
         }
         return (T) temp.getData();
     }

     public void printList(){
         Node temp= head;
         while (temp!=null){
             System.out.println(temp.getData());
             temp= temp.next;
         }
     }

     public int size(){return numNodes;}


}
