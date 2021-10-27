package bai9_dsa_danh_sach.bai_tap;

public class MyLinkedList<E> {
    private class Node{
        private Node next;
        private Object data;

        public Node(Object data){
            this.data=data;
        }

        public Object getData(){
            return this.data;
        }
    }

    private Node head;
    private int numNodes=0;

    public MyLinkedList() {
    }

    public void addFirst(E element){
        //Khai báo 1 biến temp trỏ đến giá trị của head
        Node temp=head;
        head= new Node(element);
        //head.next trỏ đến temp
        head.next= temp;
        numNodes++;
    }

    public void addLast(E element){
        Node temp= head;
        // sẽ cho con trỏ chạy đến phần tử cuối cùng trong danh sách
        while (temp.next!=null){
            temp= temp.next;
        }
        temp.next= new Node(element);
        numNodes++;
    }

    public void add(int index, E element){
        Node temp=head;
        Node holder;

        for (int  i=0;i<index-1 && temp.next!=null;i++){
            temp=temp.next;
        }
        holder=temp.next;
        // Node tại vị trí index-1 sẽ trỏ tới node mới
        temp.next=new Node(element);
        //Node mới sẽ trỏ đến vị trí holder
        temp.next.next=holder;
        numNodes++;
    }

    public Object get(int index){
        Node temp= head;
        for (int i=0; i<index;i++){
            temp= temp.next;
        }
        return temp.data;
    }

    public int size(){
        return numNodes;
    }

    public E remove(int index){
        if (index<0 || index>numNodes){
            throw new IllegalArgumentException("Index:" +index);
        }
        Node temp= head;
        Object data;
        //Nếu index=0 thì trả về data hiện tại
        if (index==0){
            data= temp.data;
            head= head.next;
            numNodes--;
        }else {
            for (int i=0; i<index-1 && temp.next!=null;i++){
                temp=temp.next;
            }
            data= temp.next.data;
            temp.next=temp.next.next;
            numNodes--;
        }
        return (E) data;
    }

    public boolean remove(E element){
        // Remove đối tượng nếu element head
        if (head.data.equals(element)){
            remove(0);
            return true;
        }else {
            Node temp= head;
            while (temp.next !=null){
                // Nếu tồn tại 1 phần tử có data bằng data truyền vào thì node sẽ bị remove
                if (temp.next.data.equals(element)){
                    temp.next= temp.next.next;
                    numNodes--;
                    return true;
                }
                temp=temp.next;
            }
        }
        return false;
    }

    public MyLinkedList<E> clone(){
        // Kiểm tra linkedList có phần tử hay không
        if (numNodes==0){
            throw new IllegalArgumentException("LinkedList này null");
        }
        // Khai báo linkedList  trả về
        MyLinkedList<E> returnLinkedList = new MyLinkedList<>();
        Node temp= head;
        //add temp vào danh sách trả về để nó làm head;
        returnLinkedList.addFirst((E) temp.data);
        temp=temp.next;
        while (temp!=null){
            returnLinkedList.addLast((E) temp.data);
            temp=temp.next;
        }
        return returnLinkedList;
    }

    public boolean contrains(E element){
        Node temp= head;
        while (temp.next!=null){
            if (temp.data.equals(element)){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    public int indexOf( E element ){
        Node temp= head;
        for (int i =0; i<numNodes;i++){
            if (temp.getData().equals(element)){
                return i;
            }
            temp= temp.next;
        }
        return -1;
    }
}
