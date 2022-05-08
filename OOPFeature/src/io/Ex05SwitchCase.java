package io;

/**
 * Give a month as number
 * ==> print number of dáy in given month
 */
public class Ex05SwitchCase {
    public static void main(String[] args) {
        int month = 3;
        int daysinmonth = -1;

        switch (month) {
            case 1:
                daysinmonth = 31;
                break;
            case 2:
                daysinmonth = 28;
                break;
            case 3:
                daysinmonth = 31;
                break;
            case 4:
                daysinmonth = 30;
                break;
            case 5:
                daysinmonth = 31;
                break;
            default:
                System.out.println("không có dữu liệu");
                return; // thoát khỏi hàm và return void
        }

        System.out.println("dayin" + daysinmonth);
    }
}
