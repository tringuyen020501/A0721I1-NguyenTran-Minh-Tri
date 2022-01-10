package model.bean;

public class Student {
    private String name;
    private String date;
    private String address;
    private String grade;

    public Student() {
    }

    public Student(String name, String date, String address,String grade ) {
        this.name = name;
        this.date = date;
        this.address = address;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
