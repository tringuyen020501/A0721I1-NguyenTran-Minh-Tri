package bai9_dsa_danh_sach.bai_tap;

public class MyListTest {
    public static class Student{
        private int id;
        private String name;

        public Student(){
        }

        public Student(int id, String name) {
            this.id = id;
            this.name= name;
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

    public static void main(String[] args) {
        Student a=  new Student(1,"tri");
        Student b=  new Student(2,"tri1");
        Student c=  new Student(3,"tri2");
        Student d=  new Student(4,"tri3");
        Student e=  new Student(5,"tri4");
        //Student f=  new Student(6,"win");
        MyList<Student> studentMyList= new MyList<>();
        MyList<Student> newstudentMyList= new MyList<>();
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);
        // studentMyList.add(2, f);
        studentMyList.size();
        System.out.println(studentMyList.size());
        System.out.println(studentMyList.get(2).getName());
        System.out.println(studentMyList.indexOf(d));
        System.out.println(studentMyList.contains(c));
        newstudentMyList= studentMyList.clone();
        newstudentMyList.remove(1);
        for (int i=0; i<newstudentMyList.size();i++){
            System.out.println(newstudentMyList.get(i).getName());
        }



    }
}
