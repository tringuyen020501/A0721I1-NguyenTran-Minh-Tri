package bai9_dsa_danh_sach.bai_tap;

public class MyLinkedListTest {
    public static void main(String[] args) {
        class Student{
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        MyLinkedList<Student>  studentMyLinkedList= new MyLinkedList<>();
        Student student1= new Student(1,"tri1");
        Student student2= new Student(2,"tri2");
        Student student3= new Student(3,"tri3");
        Student student4= new Student(4,"tri4");
        Student student5= new Student(5,"tri5");
        studentMyLinkedList.addFirst(student1);
        studentMyLinkedList.addFirst(student2);
        studentMyLinkedList.addLast(student3);
        studentMyLinkedList.addLast(student4);
        //studentMyLinkedList.remove(1);
        //studentMyLinkedList.remove(student4);

        //MyLinkedList<Student> cloneLinkedList = studentMyLinkedList.clone();


        //for (int i=0;i< studentMyLinkedList.size();i++){
            //Student student=(Student) studentMyLinkedList.get(i);
            //Student student=(Student) cloneLinkedList.get(i);

            //System.out.println(student.getName());
        //}
        //System.out.println(studentMyLinkedList.contrains(student5));
        //System.out.println(studentMyLinkedList.indexOf(student3));
        System.out.println(studentMyLinkedList.indexOf(student5));

    }
    }


