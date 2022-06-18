package ex04;

import ex04.model.Director;
import ex04.model.Employee;
import ex04.model.Human;
import ex04.model.Manager;

public class Utils {
    public static float salaryCompany(Human[] humans){
        float salaryReceived = 0f ;
        for (Human human : humans ){
            if (human instanceof Director){
                Director director = (Director) human;
                salaryReceived = (director.getCoefficientsSalary() + director.getCofficientPosition())*3000000;
                System.out.println("Director : " + salaryReceived);
            }
            if (human instanceof Manager){
                Manager manager = (Manager) human;
                salaryReceived = (manager.getCoefficientsSalary()) *2200000;
                System.out.println("Manager : " + salaryReceived);
            }
            if (human instanceof Employee){
                Employee employee = (Employee) human;
                salaryReceived = (employee.getCoefficientsSalary()) *1250000;
                System.out.println("Employee : " +salaryReceived);
            }
        }
        return salaryReceived;
    }
}
