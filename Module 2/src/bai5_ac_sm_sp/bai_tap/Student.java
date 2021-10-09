package bai5_ac_sm_sp.bai_tap;

public class Student {
    static String name="john";
    static String classes="CO2";
    public Student(){

    }
    Student(String n, String classes){
        this.name=n;
        this.classes=classes;
    }

static {
        name="Tri3";
        classes="A07I5";

}

    public void setClasses(String classes) {
        this.classes = classes;

    }

    public void setName(String name) {
        this.name = name;

    }
}
