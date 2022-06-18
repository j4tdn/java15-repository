package ex01.model;

public class Students {
    private int id_student;
    private String nameStudent;
    private float point_LT;
    private float point_TH;

    public Students() {
    }

    public Students(int id_student, String nameStudent, float point_LT, float point_TH) {
        this.id_student = id_student;
        this.nameStudent = nameStudent;
        this.point_LT = point_LT;
        this.point_TH = point_TH;
    }

    public int getId_student() {
        return id_student;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public float getPoint_LT() {
        return point_LT;
    }

    public void setPoint_LT(float point_LT) {
        this.point_LT = point_LT;
    }

    public float getPoint_TH() {
        return point_TH;
    }

    public void setPoint_TH(float point_TH) {
        this.point_TH = point_TH;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id_student=" + id_student +
                ", nameStudent='" + nameStudent + '\'' +
                ", point_LT=" + point_LT +
                ", point_TH=" + point_TH +
                '}';
    }


    public float averageScore() {
        return (point_LT + point_TH) / 2;
    }
}
