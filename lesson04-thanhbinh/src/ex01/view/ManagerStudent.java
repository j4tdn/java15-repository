package ex01.view;

import ex01.Utils;
import ex01.model.Students;

public class ManagerStudent {
    public static void main(String[] args) {
        Students sv1 = new Students(1, "student1", 9.5f, 7.0f);
        Students sv2 = new Students(2, "student2", 8.5f, 9.5f);
        Students sv3 = new Students();

        Students[] students = {sv1, sv2, sv3};

        Utils.getInforStudents(sv3);
        Utils.findAverage(students);
        Utils.findPointbiggest(students);
    }
}
