package encapsulation.outside;

import encapsulation.inside.EmpInfo;

public class ExtenalEmployee extends EmpInfo {
    public static void main(String[] args) {
        ExtenalEmployee outside = new ExtenalEmployee();
        System.out.println(outside.name);
        System.out.println(outside.skills);
    }
}
