package bai5_ac_sm_sp.bai_tap;

public class TestStudent {
    public static void main(String[] args) {
//        Student.change();
        Student student1= new Student("Tri1","A07I1");
        Student student2= new Student("Tri2","A07I2");
        Student[] students= new Student[2];
        students[0]=student1;
        students[1]=student2;
        student1.classes="A07I4";
        student1.setName("Tri4");
        System.out.println(student1);


    }
}
