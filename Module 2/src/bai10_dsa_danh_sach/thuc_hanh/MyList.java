package bai10_dsa_danh_sach.thuc_hanh;

import java.util.Arrays;

public class MyList<T> {
    private int size =0;
    private final int DEFAULT_CAPACITY =10;
    private T[] elements;

    public MyList() {
        elements =(T[]) new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapacity(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(T element){
        if (size== elements.length){
            ensureCapacity();
        }
        //thêm phần tử element vào cuối mỗi danh sách(mảng)
        elements[size] = element;
        size++;
    }
    public T get(int i){
        if (i>=0 && i<=size){
            return  elements[i];
        }
        throw new  IndexOutOfBoundsException ("Index:" +i+ "size"+ (size-1));
    }
    public  int size() {
        return  size;
    }
}
