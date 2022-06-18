package ex04.view;

import ex04.Utils;
import ex04.model.Director;
import ex04.model.Employee;
import ex04.model.Human;
import ex04.model.Manager;

import java.util.Arrays;

public class AppCompany {
    public static void main(String[] args) {
        Director director = new Director("director",3f,2f);
        Manager manager = new Manager("manager",2.0f,100);
        Employee employee1 = new Employee("employee1",1.3f,"mobile");
        Employee employee2 = new Employee("employee2",1.7f,"Front-End");

        Human [] humans  = {director,manager,employee1,employee2};
        System.out.println(director.toString());
        System.out.println(manager.toString());
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());

        System.out.println("Salary" + Utils.salaryCompany(humans));

    }




}
