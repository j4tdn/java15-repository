package ex01;

import ex01.model.Students;

import java.util.Scanner;

public class Utils {
    public Utils() {
    }

    public static void getInforStudents(Students students) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Information of Student");
        System.out.print("fill ID student:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("fill full name student:");
        String fullname = scanner.nextLine();
        System.out.print("fill LT point:");
        float ltpoint = scanner.nextFloat();
        System.out.print("fill TH point:");
        float thpoint = scanner.nextFloat();
        scanner.close();
        students.setId_student(id);
        students.setNameStudent(fullname);
        students.setPoint_LT(ltpoint);
        students.setPoint_TH(thpoint);

    }

    public static void findAverage(Students[] students) {
        for (Students student : students) {
            if (student.averageScore() > 8.5) {
                System.out.println("Student have Average > 8.5 is \n " + student.toString());
            }
        }
    }

    public static void findPointbiggest(Students[] students) {
        for (Students student : students) {
            if (student.getPoint_LT() > student.getPoint_TH()) {
                System.out.println(student.toString());
            }
        }

    }

}
